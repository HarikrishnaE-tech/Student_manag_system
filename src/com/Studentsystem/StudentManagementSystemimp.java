package com.Studentsystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import entity.Student;
import exception.InvalidChoiceException;
import exception.NoIdFoundException;
import sort.SortStudent;
import sort.Sortstudage;
import sort.Sortstudclass;
import sort.Sortstudmark;

public class StudentManagementSystemimp implements StudentManagementSystems {
Scanner sc=new Scanner(System.in);
TreeMap<String,Student>tm=new TreeMap<String, Student>();
	@Override
	public void addstudentinform() {
		System.out.println("enter the student name");
		String stdname=sc.next();
		System.out.println("enter the student age");
		int stdage=sc.nextInt();
		System.out.println("enter the student mark");
		int stdmark=sc.nextInt();
		System.out.println("enter the student classes");
		int stdclass=sc.nextInt();
		Student s=new Student(stdname,stdage,stdmark,stdclass);
		tm.put(s.getStdid(), s);
		
	}

	@Override
	public void displaystudentinform() {
		System.out.println("enter the student id");
		String id=sc.next();
		id=id.toLowerCase();
		if(tm.containsKey(id)) {
			//Set<String>keyset=tm.keySet();
			for(String key:tm.keySet()) {
				Student s=tm.get(key);
				System.out.println(s);
			}
		}
		else {
			String message="------NO ID FOUND-------";
			try {
				throw new NoIdFoundException(message);
			}
			catch(NoIdFoundException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

	@Override
	public void displayallstudentinform() {
		if(!tm.isEmpty()) {
			
			for(String keyset:tm.keySet()) {
				Student s=tm.get(keyset);
				System.out.println(s);
			}
		}
		else {
			String message="----Dtatabase is Emplty----";
			try {
				throw new NoIdFoundException(message);
			}
			catch(NoIdFoundException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void removestudentinform() {
		System.out.println("enter the student id");
		String id=sc.next();
		if(tm.containsKey(id)) {
			for(String key:tm.keySet()) {
				Student s=tm.get(key);
				System.out.println(s);
			}
		}
		else {
			String message="----NO ID FOUND----";
			try {
				throw new NoIdFoundException(message);
			}
			catch(NoIdFoundException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

	@Override
	public void removeallstudentinform() {
		if(!tm.isEmpty()) {
			System.out.println("the student inform cleRED");
			tm.clear();
		}
		
	}

	@Override
	public void updatestudentinform() {
		System.out.println("enter the Id of the Student to be updated");
		String id=sc.next();
		
		if(tm.containsKey(id)) {
			Student student=tm.get(id);
			System.out.println("1.name to update\n2.age to be updated");
			System.out.println("3.mark to update\n4.class to be updated");
			int choice =sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter the new name");
				String name=sc.next();
				student.setStdname(name);
				System.out.println("update data is");
				System.out.println(student);
			case 2:
				System.out.println("enter the new age");
				int age=sc.nextInt();
				student.setStdage(age);
				System.out.println("update data is");
				System.out.println(student);
			case 3:
				System.out.println("enter the mark");
				int mark=sc.nextInt();
				student.setStdmark(mark);
				System.out.println("update data is");
				System.out.println(student);
			case 4:
				System.out.println("enter the class");
				int stdclass=sc.nextInt();
				student.setStdmark(stdclass);
				System.out.println("update data is");
				System.out.println(student);
			default:
				String message="Invalid input";
				try {
					throw new InvalidChoiceException(message);
				}
				catch(InvalidChoiceException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		else {
			String message="no id found";
		
		try {
			throw new NoIdFoundException(message);
		}
		catch(NoIdFoundException e) {
			System.out.println(e.getMessage());
		}
		}
	}

	@Override
	public void countthestudent() {
		System.out.println("the number of student is"+tm.size());
	}

	@Override
	public void sortstudentlist() {
		ArrayList a=new ArrayList();
		for(String key:tm.keySet()) {
			Student student=tm.get(key);
			a.add(student);
			System.out.println("1.sort based on name\n2.sort based on age");
			System.out.println("3.sort based on mark\n4.sort based on stdclass");
			int choice =sc.nextInt();
			switch(choice) {
			case 1:
				Collections.sort(a,new SortStudent());
				System.out.println(a);
				break;
			case 2:
				Collections.sort(a,new Sortstudage());
				System.out.println(a);
				break;
			case 3:
				Collections.sort(a,new Sortstudmark());
				System.out.println(a);
				break;
			case 4:
				Collections.sort(a,new Sortstudclass());
				System.out.println(a);
				break;
			default:
				String message="Invalid input";
				try {
					throw new InvalidChoiceException(message);
				}
				catch(InvalidChoiceException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
	}

	@Override
	public void studentwithhighestmark() {
		
			ArrayList a=new ArrayList();
			for(String key:tm.keySet()) {
				Student s=tm.get(key);
				a.add(s);
				System.out.println("the highest mark"+a.get(a.size()-1));
			}
		}
		
	

	@Override
	public void studentwithlowestmark() {
		ArrayList a=new ArrayList();
		for(String key:tm.keySet()) {
			Student s=tm.get(key);
			a.add(s);
			System.out.println("the highest mark"+a.get(0));
		}
		
	}

}
