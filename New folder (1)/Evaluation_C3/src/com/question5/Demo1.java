package com.question5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		
		List<Student> list =Arrays.asList(new Student(10,"Ram",200,"ram@mail.com","12345",new Address("Kerala","KOchi","1001")),
				new Student(20,"Viraj",400,"viraj@mail.com","11111",new Address("Kerala","Kochi","1001")),
				new Student(30,"Sam",500,"sam@mail.com","12222",new Address("Kerala","Kochi","1001")),
				new Student(40,"Tam",800,"tam@mail.com","13333",new Address("Kerala","Kochi","1001")),
				new Student(50,"Raj",400,"raj@mail.com","14444",new Address("Kerala","Kochi","1001")));
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("studentdata.txt"));
		
		oos.writeObject(list);
		
		oos.close();
		System.out.println("done");

	}

}
