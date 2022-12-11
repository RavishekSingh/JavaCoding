package com.masai;

public class Lion {
	
	  String name;
	  boolean isHungry;
	  int age;
	  static int totalDeaths;
	  static void printKillings() {
		  
		   System.out.println("Total Killings by Lions in Jungle = "+totalDeaths);
	  }
	  void thinking() {
		  if(isHungry==false) {
			  System.out.println(name+" "+"is sleeping");
		  }
		  else if(isHungry==true && age>12 ) {
			  totalDeaths=totalDeaths+2;
			  System.out.println(name+" "+"has eaten two animals");
		  }
		  else if(isHungry==true && age<=12 && age>=2 ) {
			  totalDeaths=totalDeaths+1;
			  System.out.println(name+" "+"has eaten one animals");
		  }
		  else if(isHungry==true && age<2 ) {
			  
			  System.out.println(name+" "+"is calling mom");
		  }
	  }
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lion lion1 = new Lion();
		lion1.name = "Raja";
		lion1.isHungry = true;
		lion1.age = 15;
		lion1.thinking();
		
		
		Lion lion2 = new Lion();
		lion2.name = "Babar";
		lion2.isHungry=true;
		lion2.age = 5;
		lion2.thinking();
		
		Lion lion3 = new Lion();
		lion3.name = "Babu";
		lion3.isHungry=true;
		lion3.age = 1;
		lion3.thinking();
		
		printKillings();

	}

}
