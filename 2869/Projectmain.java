package com.project;

public class Projectmain {

	public static void main(String[] args) {

		Project p=new Project();
		
		p.setProjectId(1111);
        p.setProjectName("project1");
        p.setProjectHead("head");
        p.setNoOfResources(10);
        
        System.out.println(p.toString());       

	}

}
