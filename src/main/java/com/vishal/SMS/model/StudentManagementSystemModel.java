package com.vishal.SMS.model;

public class StudentManagementSystemModel {
	private int id;
	private String name;
	private float percentage;
	
	public StudentManagementSystemModel(int id, String name, float percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPercentage() {
		return percentage;
	}


	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "StudentManagementSystemModel [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}

}
