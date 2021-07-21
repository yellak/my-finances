package com.myfinances.app.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myfinances.app.data.entity.Transaction;

/**
 * Repository to access Transaction entities.
 * 
 * @author Kálley Wilkerson
 */
@Repository
public interface TransactionRepository
  extends JpaRepository<Transaction, Long> {
}
