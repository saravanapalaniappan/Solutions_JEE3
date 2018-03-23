package com.test.pojo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        
		Main m=new Main();
		m.mainMethod();
		
	}
	
	public void mainMethod() {
		
		Batch batch=new Batch();
		Trainee[] trainees=batch.loadTrainees();
		
		System.out.println("Enter 1 to search by Trainee Id or 2 to search by gender");
		Scanner s=new Scanner(System.in);
		int opt=s.nextInt();
		
		if (opt==1) {
			int i=batch.getTraineeId();
			Trainee trainee = batch.getTrainee(i, trainees);
		
			if (trainee==null) {
				System.out.println("Trainee Id not found");
			} else
				System.out.println("Trainee:" + trainee);
		}
		else if (opt==2) {
			String gender2 = batch.getGender();
			String gender3 = gender2.toUpperCase();
			Trainee[] trainees1=batch.getTrainees(gender3, trainees);
			for (Trainee trainee1:trainees1) {
				if (trainee1!= null) {
					System.out.println("Trainee:" + trainee1);
				}
			}
		}
		else 
			System.out.println("Invalid choice");
	}
}
