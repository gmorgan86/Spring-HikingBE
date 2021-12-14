package com.qa.hiking.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // flags class as a table to Spring
public class Hiking {

	@Id // Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto_increment
	private Integer id;

	@Column(nullable = false)
	private String mountainName;

	@Column(nullable = false)
	private String region;

	@Column(nullable = false)
	private Integer height;

	@Column(nullable = false)
	private String country;

	// Constructors

	public Hiking(Integer id, String mountainName, String region, Integer height, String country) {
		super();
		this.id = id;
		this.mountainName = mountainName;
		this.region = region;
		this.height = height;
		this.country = country;
	}

	public Hiking() {
		super();
	}

	public Hiking(Integer id) {
		super();
		this.id = id;
	}

	// Getters and Setters for variables

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMountainName() {
		return mountainName;
	}

	public void setMountainName(String mountainName) {
		this.mountainName = mountainName;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	// toString

	@Override
	public String toString() {
		return "Hiking [id=" + id + ", mountainName=" + mountainName + ", region=" + region + ", height=" + height
				+ ", country=" + country + "]";
	}

}
