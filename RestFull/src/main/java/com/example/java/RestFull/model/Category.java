package com.example.java.RestFull.model;

import javax.persistence.Entity;
//import javax.persistence.CascadeType;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name="category")
public class Category {

	@Id
	private Long id;
	private String name;
	
//	@ManyToOne(cascade = CascadeType.PERSIST)
//	private User user;
}
