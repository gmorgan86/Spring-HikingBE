package com.qa.hiking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.hiking.domain.Hiking;



	public interface HikingRepo extends JpaRepository<Hiking, Integer> {

}
