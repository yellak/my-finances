package com.myfinances.app.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myfinances.app.data.entity.Transaction;

/**
 * Repository to access Transaction entities.
 * 
 * @author Kálley Wilkerson
 */
public interface TransactionRepository
  extends JpaRepository<Transaction, Long> {
}
