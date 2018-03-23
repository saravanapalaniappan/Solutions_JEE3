package com.test.pojo;

import java.util.Scanner;

public class Batch {
	
	    String batchCode;
		String startDate;
		String endDate;
		boolean ind = false;
		
		public Trainee[] loadTrainees() {
			
		Trainee tr1=new Trainee(1111,"NAME1","9998887777","XXXX.YYYY@GMAIL.COM","M",21);
		Trainee tr2=new Trainee(2222,"NAME2","9998886666","XXXX.ZZZZ@GMAIL.COM","F",21);
		Trainee tr3=new Trainee(3333,"NAME3","9998885555","XXXX.XXXX@GMAIL.COM","M",21);
		Trainee[] trainees={tr1,tr2,tr3};
		return trainees;
		}
		
		public int getTraineeId() {
			
			System.out.println("Enter Trainee Id");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			return i;
		}
		
		public Trainee getTrainee(int i, Trainee[] trainees) {
			
			Trainee trainee1 = null;
			for (Trainee trainee: trainees) {
				if (trainee.traineeId==i) {
					System.out.println("Trainee id found");
					trainee1=trainee;	
				}
			}
            return trainee1;
		}
		
		public Trainee[] getTrainees(String ipGender, Trainee[] trainees) {
			Trainee[] trainees1 = new Trainee[3];
			int j=0;
			for (Trainee trainee: trainees) {
				if (trainee.gender.equals(ipGender)) {
					trainees1[j]=trainee;
					j++;
				}
			}
            return trainees1;
			
		}

		public String getGender() {
			System.out.println("Enter Gender");
			Scanner sc = new Scanner(System.in);
			String gender1 =new String((sc.nextLine()));
			return gender1;
		}
			
		
		
	}		
		
	
