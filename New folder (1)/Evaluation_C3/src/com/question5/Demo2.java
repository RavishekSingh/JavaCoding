package com.question5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) throws Exception {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("studentdata.txt"));

		Object obj = ois.readObject();
		List<Student> list = (List<Student>) obj;

		ois.close();

		for (Student p : list) {
			System.out.println(p);
		}

		list.add(new Student(60, "Rahul", 100, "rahul@mail.com", "15555", new Address("Kerala", "Kochi", "1001")));

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("studentdata.txt"));

		oos.writeObject(list);

		//oos.close();
		System.out.println("done");

	}

}
