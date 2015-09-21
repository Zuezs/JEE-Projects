package com.allen.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.allen.dao.UserDao;
import com.allen.dao.imp.UserDaoImp;
import com.allen.model.Student;


@Controller
public class StudentController {
	
	@Autowired
	UserDao stu;
	
	@RequestMapping(value = "/student.yogibear", method = RequestMethod.GET)
	public ModelAndView student(){
		return new ModelAndView("student" , "command", new Student());
	}
	
	@RequestMapping(value = "/addStudent.yogibear", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("student")Student student, ModelMap model){
		
		model.addAttribute("studentId", student.getStudentId());
		model.addAttribute("firstName", student.getFirstName());
		model.addAttribute("lastName", student.getLastName());
		model.addAttribute("email", student.getEmail());
		model.addAttribute("address", student.getAddress());
		model.addAttribute("age", student.getAge());
		model.addAttribute("grade", student.getGrade());
		model.addAttribute("sex", student.getSex());
		model.addAttribute("studentRole", student.getStudentRole());
		
		stu.addStudent(student);
		
		return "result";
	}
	
	@RequestMapping(value = "/showStudents.yogibear", method = RequestMethod.GET)
	public ModelAndView listStudents(){
		
		List<Student> list = stu.showAllStudents();
		ModelAndView model = new ModelAndView("showStudents");
		model.addObject("student", list);
		
		return model;
	}
	
	@RequestMapping(value = "/deleteStudent.yogibear", method = RequestMethod.GET)
	public String deleteStudent(@RequestParam("delete") long studId){
		
		Student student = stu.getById(studId);
		System.out.println(student);
		/*Student student = stu.getById(studId);
		
		System.out.println(student);
		model.addAttribute("studentId", student.getStudentId());
		long stuId = student.setStudentId(model.addAttribute("studentId", student.getStudentId()));
		System.out.println(studId);
		//stu.deleteStudent(student.getStudentId());
*/		
		return "redirect:/";
	}
	
	/*@RequestMapping(value = "/fruit/remove", method = RequestMethod.POST)
	public String removeAd(@RequestParam("fruit") long fruitId) {
	    Fruit fruit = fruitManager.loadById(fruitId);
	    fruitManager.removeFruit(fruit);
	    //or
	    fruitManager.removeFruitById(fruitId);
	    return "redirct:/list";
	}*/
	
	/* @RequestMapping(value = "/delete", method = RequestMethod.GET)
	    public ModelAndView deleteUser(HttpServletRequest request) {
	        int userId = Integer.parseInt(request.getParameter("id"));
	        userDao.delete(userId);
	        return new ModelAndView("redirect:/");     
	    }*/
	
}
