package com.student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) throws Exception {
	
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("studentdata.txt"));

		Object obj=ois.readObject();
		List<Student> list=(List<Student>) obj;
		
	     list.forEach(s->System.out.println(s));
	}

}
