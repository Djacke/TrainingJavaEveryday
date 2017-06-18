package com.rescde.string;

import java.util.Date;


import com.google.gson.Gson;
import com.rescde.model.Student;

public class GsonTest {

	public static void main(String ...args) {
		Gson  gson = new Gson();
		Student stu = new Student("cjq","beijing,haidian",new Date());
		System.out.println(gson.toJson(stu));
		String str = "{'name':'syl','address':'haidian','isMan':'1'}";
		System.out.println(gson.toJson(gson.fromJson(str, Student.class)));
	}

}
