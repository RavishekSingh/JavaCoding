package com.vowel;

public class Vowel {
	
	void res(String ch) {
		
		String s1="aeiouAEIOU";
		
		String s2="bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
		
		if(s1.indexOf(ch)!=-1) {
			
			System.out.println("Vowel");
		}
		
		else if(s2.indexOf(ch)!=-1) {
			
			System.out.println("Consonant");
		}
		
		else {
			System.out.println("Error");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vowel v1 = new Vowel();
		
		v1.res("a");
		
		v1.res("b");
		
		v1.res("#");

	}

}
