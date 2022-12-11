package com.employee;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws IOException {
		
//		File f =new File("abc.txt");
//		System.out.println(f.exists());
//		try {
//			f.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(f.exists());
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Employee Name");
		String name=sc.next();
		System.out.println("Enter address");;
		String add= sc.next();
		
		FileWriter fw =new FileWriter("abc.txt");
		
		fw.write(name);
		fw.write("\n");
		fw.write(add);
		fw.write("\n");
		
		fw.flush();
		fw.close();
		
		System.out.println("done");
		

	}

}
