package com.federicobenedetti.oop;

import com.federicobenedetti.oop.Controller.DataSetController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OopApplication {
	private static DataSetController _dsc;

	public static void main(String[] args) {
		// First let's start Spring
		SpringApplication.run(OopApplication.class, args);

		_dsc = new DataSetController();
	}
}

