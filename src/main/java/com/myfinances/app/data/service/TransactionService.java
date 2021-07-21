package com.myfinances.app.data.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
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
   * Logger to log transaction messages
   */
  private static final Logger LOG = Logger
      .getLogger(TransactionService.class.getSimpleName());

  /**
   * Repository to access transaction entities
   */
  @Autowired
  private TransactionRepository transactionRepository;

  /**
   * @return All the transactions present in the database.
   */
  public List<Transaction> findAll() {
    return transactionRepository.findAll();
  }

  /**
   * Saves a transaction in the database
   * 
   * @param transaction Transaction to be saved in the database
   */
  public void save(Transaction transaction) {
    if (transaction == null) {
      LOG.warning("Transaction must not be null");
      return;
    }

    transactionRepository.save(transaction);
  }

}
