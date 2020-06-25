package com.school.dto;


public class ContactPage {
	private Integer enquiry_id;
	private String childName;
	private String parentName;
	private String parentEmail;
	private String parentMobile;
	private String grade;
	private String message;
	
	
	public Integer getEnquiry_id() {
		return enquiry_id;
	}
	public void setEnquiry_id(Integer enquiry_id) {
		this.enquiry_id = enquiry_id;
	}
	public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getParentEmail() {
		return parentEmail;
	}
	public void setParentEmail(String parentEmail) {
		this.parentEmail = parentEmail;
	}
	public String getParentMobile() {
		return parentMobile;
	}
	public void setParentMobile(String parentMobile) {
		this.parentMobile = parentMobile;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ContactPage [enquiry_id=" + enquiry_id + ", childName=" + childName + ", parentName=" + parentName
				+ ", parentEmail=" + parentEmail + ", parentMobile=" + parentMobile + ", grade=" + grade + ", message="
				+ message + "]";
	}
	
	
}
