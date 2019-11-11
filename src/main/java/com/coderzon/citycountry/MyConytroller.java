package com.coderzon.citycountry;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyConytroller {

	@GetMapping("/countries")
	public  List<Country> getCountries() {
		List<Country> countries = new ArrayList<>();
		countries.add(new Country("1", "India"));
		countries.add(new Country("2", "USA"));
		countries.add(new Country("3", "UK"));
		countries.add(new Country("4", "Canada"));
		return countries;
	}
	
}
