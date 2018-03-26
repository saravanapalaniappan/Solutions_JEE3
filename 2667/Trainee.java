package com.htc.financials;

import java.io.Serializable;

public class Trainee implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private int traineeId;
	private String traineeName;
	private String contactNo;
	private String email;
	private String gender;
	private int age;

	/**
	 * Initialize Trainee
	 */
	public Trainee() {
	}

	/**
	 * Initialize Trainee
	 * 
	 * @param traineeId
	 * @param traineeName
	 * @param contactNo
	 * @param email
	 * @param gender
	 * @param age
	 */
	public Trainee(int traineeId, String traineeName, String contactNo, String email, String gender, int age) {
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.contactNo = contactNo;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	/**
	 * Get Trainee Id
	 * 
	 * @return
	 */
	public int getTraineeId() {
		return traineeId;
	}

	/**
	 * Set Trainee Id
	 * 
	 * @param traineeId
	 */
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	/**
	 * Get Trainee Name
	 * 
	 * @return
	 */
	public String getTraineeName() {
		return traineeName;
	}

	/**
	 * Set Trainee Name
	 * 
	 * @param traineeName
	 */
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	/**
	 * Get contact number of trainee
	 * 
	 * @return
	 */
	public String getContactNo() {
		return contactNo;
	}

	/**
	 * Set contact number of trainee
	 * 
	 * @param contactNo
	 */
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	/**
	 * Get email-id of trainee
	 * 
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Set email-id of trainee
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Get gender of trainee
	 * 
	 * @return
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Set gender of trainee
	 * 
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Get the age of trainee
	 * 
	 * @return
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Set the age of trainee
	 * 
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Trainee{" + "Id=" + traineeId + ", Name='" + traineeName + '\'' + ", Contact No='" + contactNo + '\''
				+ ", Email='" + email + '\'' + ", Gender='" + gender + '\'' + ", Age=" + age + '}';
	}

	/**
	 * Compare the trainee object
	 * 
	 * @param o
	 * @return
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Trainee trainee = (Trainee) o;

		if (traineeId != trainee.traineeId)
			return false;
		if (age != trainee.age)
			return false;
		if (!traineeName.equals(trainee.traineeName))
			return false;
		if (!contactNo.equals(trainee.contactNo))
			return false;
		if (!email.equals(trainee.email))
			return false;
		return gender.equals(trainee.gender);

	}

	@Override
	public int hashCode() {
		int result = traineeId;
		result = 31 * result + traineeName.hashCode();
		result = 31 * result + contactNo.hashCode();
		result = 31 * result + email.hashCode();
		result = 31 * result + gender.hashCode();
		result = 31 * result + age;
		return result;
	}
}
