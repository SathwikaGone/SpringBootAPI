package com.example.java.RestFull.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="expense")
public class Expense {
	
	@Id
	private Long id ;
	
	private String  description;

	private Instant expenceDate;
	
	private String location;

	
	@ManyToOne
	private Category category;
	
	@ManyToOne
	private User user;
	
}
