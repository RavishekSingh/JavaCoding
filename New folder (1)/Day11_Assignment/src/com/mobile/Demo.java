package com.mobile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
	
	public static void writeFile() throws IOException {
		BufferedWriter write = new BufferedWriter(new FileWriter("number.txt"));
		write.write("1234567890");
		write.newLine();
		write.write("6234567890");
		write.newLine();
		write.write("8234567890");
		write.newLine();
		write.write("7234567890");
		write.newLine();
		write.write("9234567890");
		write.newLine();
		write.write("0234567890");
		write.newLine();
		write.write("5234567890");
		write.newLine();
		write.write("3234567890");
		
		write.close();
	}
	
	public static void validateNumber() throws IOException {
		BufferedReader read =new BufferedReader(new FileReader("number.txt"));
		String number = "";
		while((number=read.readLine())!=null) {
			System.out.println(number);
			
			Pattern pt= Pattern.compile("(0/9/6/7/8)?[7-9][0-9]");
			Matcher mt = pt.matcher(number);
			
			if(mt.find()) {
				BufferedWriter write= new BufferedWriter(new FileWriter("newlist.txt"));
				write.write(number);
				write.newLine();
			}
		}
		System.out.println("done");
	}

	public static void main(String[] args) {
		
		try {
			writeFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			validateNumber();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
