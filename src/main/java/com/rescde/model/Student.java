package com.rescde.model;

import java.util.Date;

import com.google.gson.Gson;

import lombok.Data;


public @Data class Student {
    public  String name;
    public  String address;
    public  Date dateOfBirth;
    public String isMan = "0";

    public Student() {
    }

    public Student(String name, String address, Date dateOfBirth) {
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }
    
    public static void main(String[] args){
    	Student st = new Student("chenjq","haidian",null);
    	System.out.println(st);
    	Gson  gson = new Gson();
    	System.out.println(gson.toJson(st));
    	String str = "{\"name\":\"chenjq\",\"address\":\"mudanyuan\",\"isMan\":\"0\"}";
    	Student tt = gson.fromJson(str, Student.class);
    	System.out.println(gson.toJson(tt));
    }
}
