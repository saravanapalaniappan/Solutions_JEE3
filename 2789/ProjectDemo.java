package com.santy.impl;

import com.santy.entity.Project;

import java.util.Scanner;

/**
 * Demo class for Project entity
 */
public class ProjectDemo {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Project project = new Project();

        System.out.print("Enter Project Id: ");
        project.setProjectId(sc.nextLine());
        System.out.print("Enter Project Name: ");
        project.setProjectName(sc.nextLine());
        System.out.print("Enter Project Head: ");
        project.setProjectHead(sc.nextLine());
        System.out.print("Enter Number of Resources: ");
        project.setNoOfResources(sc.nextInt());
        System.out.print(project);
    }
}
