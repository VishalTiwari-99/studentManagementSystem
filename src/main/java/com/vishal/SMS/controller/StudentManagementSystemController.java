package com.vishal.SMS.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vishal.SMS.model.StudentManagementSystemModel;
import com.vishal.SMS.service.StudentManagementSystemDAO;

@Controller
public class StudentManagementSystemController {
	
	@Autowired
	StudentManagementSystemDAO service;
	
	@ResponseBody
	@RequestMapping("/get")
	public List<StudentManagementSystemModel> getStudents(@RequestParam(required=false,defaultValue="-1") int id){
		if(id==-1) {
			return service.get();
		}
		List<StudentManagementSystemModel> stu = new ArrayList<StudentManagementSystemModel>();
		stu.add(service.get(id));
		return stu;
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String deleteStudent(@PathVariable("id") String id) {
		service.delete(Integer.parseInt(id));
		return "redirect:/get";
	}
	
	@PostMapping("/create")
	public String createStudent(@RequestBody StudentManagementSystemModel s){
		service.create(s);
		return "redirect:/get"; 
	}
	
	@PostMapping("/update")
	public String updateStudent(@RequestBody StudentManagementSystemModel s){
		service.update(s);
		return "redirect:/get"; 
	}
}
