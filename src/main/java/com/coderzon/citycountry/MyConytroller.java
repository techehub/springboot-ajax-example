package com.coderzon.citycountry;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
public class MyConytroller {

	@Value("${databasename}") String name;
	
	private static final Logger logger = LoggerFactory.getLogger(MyConytroller.class);
	   
	
	@GetMapping("/countries")
	public  List<Country> getCountries() {
		List<Country> countries = new ArrayList<>();
		countries.add(new Country("1", "India"));
		countries.add(new Country("2", "USA"));
		countries.add(new Country("3", "UK"));
		countries.add(new Country("4", "Canada"));
		
		logger.info("this is a info message");
	    logger.warn("this is a warn message");
	    logger.error("this is a error message");
		
	    
		try {
			int i=0;
			int x= 10/i;
		}
		catch (Exception e) {
			logger.error("ERROR", e);
		}
		
		
		return countries;
	
	}
	
	@GetMapping ("/students")
	public List<Student> getStudents (){
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Anil", "sadasd@sddff.com"));
		students.add(new Student("Ashraf", "sadasd@sddff.com"));
		students.add(new Student("Neenu", "sadasd@sddff.com"));
		
		return students;
	}
	
	
	@GetMapping ("/dbname")
	public String dbdetails (){		
		return name;
	}
	
}
