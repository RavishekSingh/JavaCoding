package com.student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		List<Student> list = Arrays.asList(new Student(10,"Ram",400,new Address("Kerala","Kochi",1001)),
				new Student(20,"Raj",500,new Address("Kerala","Kochi",1001)),
				new Student(30,"Viraj",200,new Address("Kerala","Kochi",1001)),
				new Student(40,"Saj",700,new Address("Kerala","Kochi",1001)),
				new Student(50,"Taj",300,new Address("Kerala","Kochi",1001)));
		
		ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("studentdata.txt"));

		oos.writeObject(list);
		
		oos.close();
		System.out.println("done");
	}

}
