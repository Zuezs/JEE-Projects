package jdbc;

import java.sql.*;

public class ScrollableResultSetDemo {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = JDBCUtility.getConnection();
			
			//cannot do select *, specify columns
			final String sql = "select id, firstname, lastname, dept_number from employees " + 
				"order by id desc";
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			
			ResultSet rs = stmt.executeQuery(sql);
			int rowCount = 0;
			
			while(rs.next()){
				System.out.println(rs.getString("firstname") + " "
						+ rs.getString("lastname") + " " 
						+ rs.getInt("dept_number"));
				final int dept = rs.getInt("dept_number");
				
				if(dept < 10000){
					rs.updateInt("dept_number", dept * 2);
					rs.updateRow();
					System.out.println("\tUpdated row");
				}
				rowCount++;
			}
			
			rs.moveToInsertRow();
			rs.updateInt(1, 333);
			rs.updateString(2, "Genereated");
			rs.updateString(3, "Row");
			rs.updateInt(4, 12345);
			rs.insertRow();
			
			//move cursor back to where it was 
			rs.moveToCurrentRow();
			
			//move to the end and backwards again
			rs.last();
			
			System.out.println("\nPrinting backwards...");
			
			do {
				System.out.println(rs.getString("firstname") + " "
						+ rs.getString("lastname"));
			}while (rs.previous());
			
			
			//Jump to location in ResultSet
			rs.absolute(rowCount / 2 + 1);
			System.out.println("\nPrinting row in the middle");
			System.out.println(rs.getString("firstname") + " "
					+ rs.getString("lastname"));
			
			
			//Jump two rows
			rs.relative(2);
			System.out.println("\nPrinting row two places later");
			System.out.println(rs.getString("firstname") + " " 
					+ rs.getString("lastname"));
			
			
		}catch(Exception e){
			
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
