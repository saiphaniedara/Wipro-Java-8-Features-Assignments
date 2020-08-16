package com.wipro.streamAPI;

import java.util.ArrayList;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students = new ArrayList<Student>();
		Student s1 = new Student(101,"Sai Phani",65);
		students.add(s1);
		s1 = new Student(102, "Sai Krishna", 72);
		students.add(s1);
		s1 = new Student(103, "Surya", 30);
		students.add(s1);
		s1 = new Student(104, "Om Prasad", 100);
		students.add(s1);
		s1 = new Student(105, "Pavan", 40);
		students.add(s1);
		long count = students.stream().filter(st->st.getMark()>=50).count();
		System.out.println("No of students who cleared the test : "+count);
	}

}
