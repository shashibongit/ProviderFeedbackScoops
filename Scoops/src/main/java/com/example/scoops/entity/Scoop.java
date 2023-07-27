package com.example.scoops.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "scoops")
public class Scoop {


	@Id
	private String _id;
	private String city;
	private String specialization;
	private String drName;
	private String hospitalName;
	private String address;
	private String treatment;
	private String review;
	private String empName;
	private String empEmail;
	private String empPhone;

	public Scoop(String _id, String city, String specialization,
				 String drName, String hospitalName, String address,
				 String treatment, String review, String empName,
				 String empEmail, String empPhone) {
		super();
		this._id = _id;
		this.city = city;
		this.specialization = specialization;
		this.drName = drName;
		this.hospitalName = hospitalName;
		this.address = address;
		this.treatment = treatment;
		this.review = review;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empPhone = empPhone;
	}

	public Scoop() {
		
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return _id;
	}

	public void setId(String _id) {
		this._id = _id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getDrName() {
		return drName;
	}

	public void setDrName(String drName) {
		this.drName = drName;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	@Override
	public String toString() {
		return "Scoop [city=" + city + ", drName=" + drName + ", employee"+ empName+ ", id=" + _id + "]";
	}

	
}
