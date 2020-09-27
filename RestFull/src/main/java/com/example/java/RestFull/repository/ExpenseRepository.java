package com.example.java.RestFull.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.java.RestFull.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
