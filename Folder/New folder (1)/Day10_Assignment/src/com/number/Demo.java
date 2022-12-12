package com.number;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {

	public static void main(String[] args) {
		
		EvenOdd[] jobs= {
				new EvenOdd(10),
				new EvenOdd(15),
				new EvenOdd(12),
				new EvenOdd(17),
				new EvenOdd(16),
				new EvenOdd(18)
		};

		ExecutorService service=Executors.newFixedThreadPool(3);

		for(EvenOdd job:jobs) {
			Future<String> f= service.submit(job);
			try {
				System.out.println(f.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		service.shutdown();
	}

}
