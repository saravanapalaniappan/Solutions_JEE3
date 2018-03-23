package com.test.pojo;

public class Trainee {

	int traineeId;
	String traineeName;
	String contactNo;
	String email;
	String gender;
	int age;
	
	public void setTraineeId(int traineeId) {
		 this.traineeId=traineeId;
	}
	
	public int getTraineeId() {
		return traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Trainee(int traineeId, String traineeName, String contactNo,
			String email, String gender, int age) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.contactNo = contactNo;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Trainee [getAge()=" + getAge() + ", getContactNo()="
				+ getContactNo() + ", getEmail()=" + getEmail()
				+ ", getGender()=" + getGender() + ", getTraineeId()="
				+ getTraineeId() + ", getTraineeName()=" + getTraineeName()
				+ "]";
	}
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		else return false;
		
	}
	
}

