package com.masai;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Cities {

	@Autowired
	private List<String> cities;
	
	public void showCities()
	{
		System.out.println(cities);
	}
}
