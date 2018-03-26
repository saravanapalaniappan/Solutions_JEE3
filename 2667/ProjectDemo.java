package com.htc.financials;

import java.util.Scanner;

public class ProjectDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Project project = new Project();

		System.out.print("Enter Project Id: ");
		project.setProjectId(scanner.nextLine());
		System.out.print("Enter Project Name: ");
		project.setProjectName(scanner.nextLine());
		System.out.print("Enter Project Head: ");
		project.setProjectHead(scanner.nextLine());
		System.out.print("Enter Number of Resources: ");
		project.setNoOfResources(scanner.nextInt());
		System.out.print(project);
	}
}