package sis.com.bo;

import java.io.InputStream;
import java.sql.Date;

import com.mysql.jdbc.Blob;

public class RegStudent {
	
	
	private long id ;
	private long enrollmemtNumber;
	private String name;
	private String course;
	private String branch;
	private String mobileNumber;
	private String email;
	private int semester;
	private String address;
	private String selected;
	
	private String fatherName;
	private String fatherMobile;
	private String fatherEmail;
	private String fatherAddress;
	
	public String getSelected() {
		return selected;
	}
	public void setSelected(String selected) {
		this.selected = selected;
	}
	private String guardianName;
	private String guardianMobile;
	private String guardianEmail;
	private String guardianAddress;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getEnrollmemtNumber() {
		return enrollmemtNumber;
	}
	public void setEnrollmemtNumber(long enrollmemtNumber) {
		this.enrollmemtNumber = enrollmemtNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getFatherMobile() {
		return fatherMobile;
	}
	public void setFatherMobile(String fatherMobile) {
		this.fatherMobile = fatherMobile;
	}
	public String getFatherEmail() {
		return fatherEmail;
	}
	public void setFatherEmail(String fatherEmail) {
		this.fatherEmail = fatherEmail;
	}
	public String getFatherAddress() {
		return fatherAddress;
	}
	public void setFatherAddress(String fatherAddress) {
		this.fatherAddress = fatherAddress;
	}
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getGuardianMobile() {
		return guardianMobile;
	}
	public void setGuardianMobile(String guardianMobile) {
		this.guardianMobile = guardianMobile;
	}
	public String getGuardianEmail() {
		return guardianEmail;
	}
	public void setGuardianEmail(String guardianEmail) {
		this.guardianEmail = guardianEmail;
	}
	public String getGuardianAddress() {
		return guardianAddress;
	}
	public void setGuardianAddress(String guardianAddress) {
		this.guardianAddress = guardianAddress;
	}
	
	
	
}
