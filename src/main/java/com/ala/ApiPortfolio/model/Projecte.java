package com.ala.ApiPortfolio.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

	@Entity @Data @NoArgsConstructor @AllArgsConstructor
	public class Projecte {
		@Id @GeneratedValue(strategy = GenerationType.AUTO)
		int id;
		String name;
		String technology;
		String description;
		String imgagePath;


		

	}

	

