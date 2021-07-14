package com.myfinances.app.data.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myfinances.app.data.entity.Transaction;
import com.myfinances.app.data.repository.TransactionRepository;

/**
 * Services to deal with transactions.
 * 
 * @author Kálley Wilkerson
 */
@Service
public class TransactionService {

  /**
   * Repository to access transaction entities
   */
  private TransactionRepository transactionRepository;

  /**
   * Constructor method
   * 
   * @param transactionRepository Repository of transactions.
   */
  protected TransactionService(TransactionRepository transactionRepository) {
    this.transactionRepository = transactionRepository;
  }

  /**
   * @return All the transactions present in the database.
   */
  public List<Transaction> findAll() {
    return transactionRepository.findAll();
  }

}
