package com.htc.FirstProject;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Batch {

	private String batchCode;
	private Date startDate;
	private Date endDate;
	private Trainee[] trainees;
	
	
	
	public String getBatchCode() {
		return batchCode;
	}
	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Trainee[] getTrainees() {
		return trainees;
	}
	public void setTrainees(Trainee[] trainees) {
		this.trainees = trainees;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((batchCode == null) ? 0 : batchCode.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + Arrays.hashCode(trainees);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Batch other = (Batch) obj;
		if (batchCode == null) {
			if (other.batchCode != null)
				return false;
		} else if (!batchCode.equals(other.batchCode))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (!Arrays.equals(trainees, other.trainees))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Batch [batchCode=" + batchCode + ", startDate=" + startDate + ", endDate=" + endDate + ", trainees="
				+ Arrays.toString(trainees) + "]";
	}
	public Batch(String batchCode, Date startDate, Date endDate, Trainee[] trainees) {
		super();
		this.batchCode = batchCode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.trainees = trainees;
	}
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Trainee getTrainee(int traineeId) throws TraineeNotFoundException {
        for (Trainee trainee : this.trainees) {
            if (trainee.getTraineeId() == traineeId)
                return trainee;
        }
        throw new TraineeNotFoundException("Trainee Id: " + traineeId + " not found.");
    }
	
		
	
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
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Batch batch = new Batch();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //DataInputStream datainput = new DataInputStream(System.in);
        System.out.print("Enter Batch Code:");
        batch.setBatchCode(br.readLine());
        System.out.print("Enter Batch Start Date(dd-MM-yyyy:");
        batch.setStartDate(simpleDateFormat.parse(br.readLine()));
        System.out.print("Enter Batch End Date(dd-MM-yyyy):");
        batch.setEndDate(simpleDateFormat.parse(br.readLine()));
        System.out.print("Enter Total Number of Trainee:");
        Trainee[] trainees = new Trainee[Integer.parseInt(br.readLine())];
        for (int i = 0; i < trainees.length; i++) {
            trainees[i] = new Trainee();
            	System.out.print("Enter Trainee ID: ");
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

	
	

