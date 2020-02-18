package com.jogi.springeurekaclientstudentservice.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

	private String name;
	private String className;

	public Student(String name, String className) {
		super();
		this.name = name;
		this.className = className;
	}

}
