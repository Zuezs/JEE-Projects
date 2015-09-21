package com.eintern.spring.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.management.RuntimeErrorException;
import javax.sql.DataSource;
import javax.swing.tree.TreePath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Component;

//@Component-- in JDBC dont have to use because it extends J//Makes it a bean named "JDBCDaoImpl"
public class JDBCDaoImpl extends JdbcDaoSupport {
	
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParam;
	
	//Not Using Jdbc Template
	/*public Circle getCircle(int circleId){
	
		Connection conn = null;
		
		try{
				
			conn = dataSource.getConnection();
			
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM circle where id = ?");
			ps.setInt(1, circleId);
			
			Circle circle = null;
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				circle = new Circle(circleId, rs.getString("name"));
			}
			rs.close();
			ps.close();
			return circle;
			
		}catch(Exception e){
			throw new RuntimeException(e);
		}finally{
			try{
				conn.close();
				
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}*/
	
	public int getCircleCount(){
		String sql = "SELECT COUNT(*) FROM CIRCLE";
		return this.getJdbcTemplate().queryForObject(sql, Integer.class);	
	}
	
	public String getCircleName(int circleId){
		String sql = "SELECT NAME FROM CIRCLE WHERE ID = ?";
		return jdbcTemplate.queryForObject(sql, new Object[]{circleId}, String.class);
	}
	
	public Circle getCircleforId(int circleId){
		//this method uses a RowMapper<T>
		String sql = "SELECT * FROM CIRCLE WHERE ID = ?";
		return jdbcTemplate.queryForObject(sql, new Object[]{circleId}, new CircleMapper());
	}
	
	public List<Circle> getAllCircles(){
		
		String sql = "SELECT * FROM CIRCLE";
		return this.getJdbcTemplate().query(sql, new CircleMapper());
	}
	
	//Uses Jdbc Template extending JdcbDaoSupport
	public void insertCircle(Circle circle){
		String sql = "INSERT INTO CIRCLE (ID, NAME) VALUES (?,?)";
		this.getJdbcTemplate().update(sql, new Object[]{circle.getId(), circle.getName()});
	}
	
	//Using namedParameteres - same method as above
	/*public void insertCircle(Circle circle){
		String sql = "INSERT INTO CIRCLE (ID, NAME) VALUES (:id,:name)";
		SqlParameterSource namedParameteres = new MapSqlParameterSource("id", circle.getId())
																		.addValue("name", circle.getName());
		namedParam.update(sql, namedParameteres);
		
	}*/
	
	
	//Creates table using excute VS the update method
	public void createTriangleTable(){
		String sql = "CREATE TABLE TRIANGLE (ID INTEGER, NAME VARCHAR(50))";
		jdbcTemplate.execute(sql);
	}
	
	private static final class CircleMapper implements RowMapper<Circle>{
		
		//First arg is resultSet - what the jdbc gets after query
		//Second arg is row number in the resultSet
		@Override
		public Circle mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			
			Circle circle = new Circle();
			circle.setId(resultSet.getInt("ID"));
			circle.setName(resultSet.getString("NAME"));
			
			return circle;
		}

		
		
	}

	
	/*public DataSource getDs() {
		return dataSource;
	}*/

	/*@Autowired
	public void setDs(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.namedParam = new NamedParameterJdbcTemplate(dataSource);
	}*/

	
	
}
