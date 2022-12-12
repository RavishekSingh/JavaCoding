package com.question3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {

	public static void main(String[] args) {
		
		Product[] jobs = {
				new Product(1),
				new Product(2),
				new Product(3),
				new Product(4),
				new Product(5),
				new Product(6),
				
		};
		
		ExecutorService service= Executors.newFixedThreadPool(3);
		
		for(Product job:jobs) {
			Future<Integer> f= service.submit(job);
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
