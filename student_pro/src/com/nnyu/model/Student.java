package com.nnyu.model;

/**
 * 学生实体类
 * @author 张山
 *  创建时间：2019/05/07
 *  
 */
public class Student {
	
     private int id;
     private String username;
     private String password;
     private int age;
     private int sex;
     
	public Student(int id, String username, String password, int age, int sex) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
		this.sex = sex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
     
     
}
