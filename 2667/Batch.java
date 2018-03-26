package com.htc.financials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.htc.financials.exceptions.TraineeNotFoundException;

public class Batch {
	private String batchCode;
	private Date startDate;
	private Date endDate;
	private Trainee[] trainees;

	/**
	 * Initialize Batch
	 */
	public Batch() {
	}

	/**
	 * Initialize Batch
	 *
	 * @param batchCode
	 * @param startDate
	 * @param endDate
	 */
	public Batch(String batchCode, Date startDate, Date endDate) {
		this.batchCode = batchCode;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	/**
	 * Get batch code
	 *
	 * @return
	 */
	public String getBatchCode() {
		return batchCode;
	}

	/**
	 * Set Batch code
	 *
	 * @param batchCode
	 */
	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	/**
	 * Get start date of a batch
	 *
	 * @return
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Set start date of a batch
	 *
	 * @param startDate
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * Get end date of a batch
	 *
	 * @return
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Set end date of a batch
	 *
	 * @param endDate
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * Get trainees in this batch
	 *
	 * @return
	 */
	public Trainee[] getTrainees() {
		return trainees;
	}

	/**
	 * Set trainees for this batch
	 *
	 * @param trainees
	 */
	public void setTrainees(Trainee[] trainees) {
		this.trainees = trainees;
	}

	/**
	 * Get the trainee for a given traineeId
	 *
	 * @param traineeId
	 * @return
	 */
	public Trainee getTrainee(int traineeId) throws TraineeNotFoundException {
		for (Trainee trainee : this.trainees) {
			if (trainee.getTraineeId() == traineeId)
				return trainee;
		}
		throw new TraineeNotFoundException("Trainee Id: " + traineeId + " not found.");
	}

	/**
	 * Get the list of trainees for the given gender
	 *
	 * @param gender
	 * @return
	 */
	public Trainee[] getTrainee(String gender) {
		Trainee[] traineesByGender = new Trainee[this.trainees.length];
		int i = 0;
		int totalLength = 0;
		for (Trainee trainee : this.trainees) {
			if (trainee.getGender().equals(gender)) {
				traineesByGender[i] = trainee;
				i++;
				totalLength++;
			}
		}
		return Arrays.<Trainee>copyOf(traineesByGender, totalLength);
	}

	public static void main(String[] args) throws ParseException, TraineeNotFoundException, IOException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Batch batch = new Batch();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Batch Code:");
		batch.setBatchCode(br.readLine());
		System.out.print("Enter Batch Start Date(yyyy-MM-dd):");
		batch.setStartDate(simpleDateFormat.parse(br.readLine()));
		System.out.print("Enter Batch End Date(yyyy-MM-dd):");
		batch.setEndDate(simpleDateFormat.parse(br.readLine()));
		System.out.print("Enter Total Number of Trainee:");
		Trainee[] trainees = new Trainee[Integer.parseInt(br.readLine())];
		for (int i = 0; i < trainees.length; i++) {
			trainees[i] = new Trainee();
			System.out.print("Enter Trainee Id: ");
			trainees[i].setTraineeId(Integer.parseInt(br.readLine()));
			System.out.print("Enter Trainee Name: ");
			trainees[i].setTraineeName(br.readLine());
			System.out.print("Enter Trainee Contact Number: ");
			trainees[i].setContactNo(br.readLine());
			System.out.print("Enter Trainee Email Id: ");
			trainees[i].setEmail(br.readLine());
			System.out.print("Enter Gender (M/F): ");
			trainees[i].setGender(br.readLine());
			System.out.print("Enter Trainee Age: ");
			trainees[i].setAge(Integer.parseInt(br.readLine()));
		}
		batch.setTrainees(trainees);
		System.out.print("Find trainee by Id: ");
		System.out.println(batch.getTrainee(Integer.parseInt(br.readLine())));
		System.out.print("Enter gender(M/F) to find trainees by gender: ");
		System.out.println(Arrays.toString(batch.getTrainee(br.readLine())));
		br.close();

	}
}