package com.vishal.SMS.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vishal.SMS.model.StudentManagementSystemModel;

@Service
public class StudentManagementSystemDAO {
	private static List<StudentManagementSystemModel> stuList = new ArrayList<StudentManagementSystemModel>();
	
	static {
		StudentManagementSystemModel s1 = new StudentManagementSystemModel(1, "Vishal", 87);
		StudentManagementSystemModel s2 = new StudentManagementSystemModel(2, "Tiwari", 90);
		StudentManagementSystemModel s3 = new StudentManagementSystemModel(3, "Anshika", 77);
		StudentManagementSystemModel s4 = new StudentManagementSystemModel(4, "Rahul", 76);
		StudentManagementSystemModel s5 = new StudentManagementSystemModel(5, "Yash", 92);
		stuList.add(s1);
		stuList.add(s2);
		stuList.add(s3);
		stuList.add(s4);
		stuList.add(s5);
	}
	
	
	public StudentManagementSystemModel get(int id){
		for(StudentManagementSystemModel  s : stuList) {
			if(s.getId() == id) {
				return s;
			}
		}
		return null;
	}
	
	public List<StudentManagementSystemModel> get(){
		return this.stuList;
	}
	
	public void delete(int id) {
		for(int i=0; i<stuList.size(); i++) {
			if(stuList.get(i).getId() == id) {
				stuList.remove(i);
				return;
			}
			return;
		}
	}
	
	public void create(StudentManagementSystemModel s) {
		stuList.add(s);
		return;
	}
	
	public void update(StudentManagementSystemModel s) {
		for(int i=0; i<stuList.size(); i++) {
			if(stuList.get(i).getId() == s.getId()) {
				stuList.get(i).setName(s.getName());
				stuList.get(i).setPercentage(s.getPercentage());
				return;
			}
		}
			return;
	}
}
