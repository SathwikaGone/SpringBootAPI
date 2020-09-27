package com.example.java.RestFull.controller;

import java.net.URISyntaxException;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.java.RestFull.model.Expense;
import com.example.java.RestFull.repository.ExpenseRepository;


@RestController
@RequestMapping("/api")
public class ExpenseController {

	
	@Autowired
	private ExpenseRepository expenseRepository;
	
	@GetMapping("/expenses")
	java.util.List<Expense> getExpenses(){
		return expenseRepository.findAll();

	}
	
	@DeleteMapping("/expense/{id}")
	ResponseEntity<?> deleteExpense(@PathVariable Long id){
		expenseRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
	@PostMapping("/expense")
	ResponseEntity<Expense> createExpense(@Validated @RequestBody Expense expense) throws URISyntaxException{
		Expense result= expenseRepository.save(expense);
		return ResponseEntity.created(new URI("/api/expense" + result.getId())).body(result);
	}
}

