package com.qa.hiking.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.qa.hiking.domain.Hiking;

public interface HikingService {

	//Created
	Hiking createHill(Hiking hills);
	
	//GetAll
	List<Hiking> getAllHills();
	
	//Get By ID
	Hiking getHill(Integer id);
	
//	//Get by name
//	List<Hiking> getAllHillsByName(String name);

	
	//Replace by ID
	Hiking replaceHill(Integer id, Hiking newHill);
	
	//Delete by ID
	void deleteHill(@PathVariable Integer id);
	
	
}
