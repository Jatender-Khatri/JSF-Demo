package com.managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.dao.StudentDao;
import com.daoImpl.StudentDaoImpl;
import com.model.StudentEntitiy;
@ManagedBean(name="studentMB")
@RequestScoped
public class StudentManagedBeans {
	private Integer studentId;
	private String studentName;
	private String rollNumber;
	private Integer age;
	private String address;
	private String email;
	
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the studentId
	 */
	public Integer getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the rollNumber
	 */
	public String getRollNumber() {
		return rollNumber;
	}
	/**
	 * @param rollNumber the rollNumber to set
	 */
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public String addStudent()
	{
		System.out.println("Student Name : " + this.studentName);
		System.out.println("Roll Number : " + this.rollNumber);
		System.out.println("Age : " + this.age);
		System.out.println("Email : " + this.email);
		System.out.println("Address : " + this.address);
		StudentEntitiy student = new StudentEntitiy();
		student.setAge(this.age);
		student.setAddress(this.address);
		student.setEmail(this.email);
		student.setRollNumber(this.rollNumber);
		student.setStudentName(this.studentName);
		StudentDao dao = new StudentDaoImpl();
		dao.addStudnet(student);
		return "";
	}
}
