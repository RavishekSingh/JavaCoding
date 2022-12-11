package com.evaluation;

public class Main {

	void messageToStudents(Evaluation evaluation) {
          if(evaluation instanceof DsaEvaluation) {
        	  System.out.println("Its a DSA Evaluation");
        	  DsaEvaluation d1 =new DsaEvaluation();
        	  d1.printNoOfQuestions();
        	  d1.evaluationTiming();
          }
          else {
        	  System.out.println("Its a Coding Evaluation");
        	  CodingEvaluation c1= new CodingEvaluation();
        	  c1.printNoOfQuestions();
        	  c1.evaluationTiming();
          }
          
          System.out.println("====================================================");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m1 =new Main();
		
		m1.messageToStudents(new DsaEvaluation());
		m1.messageToStudents(new CodingEvaluation());

	}

}
