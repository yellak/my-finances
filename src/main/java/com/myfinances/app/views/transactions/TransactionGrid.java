package com.myfinances.app.views.transactions;

import com.myfinances.app.data.entity.Transaction;
import com.myfinances.app.views.AbstractBeanGrid;

/**
 * Grid to list transactions.
 * 
 * @author Kálley Wilkerson
 */
public class TransactionGrid
  extends AbstractBeanGrid<Transaction> {

  /**
   * Serial UID version.
   */
  private static final long serialVersionUID = -8151977206008739084L;

  /**
   * Constructor method
   */
  public TransactionGrid() {
    super(Transaction.class);
    addColumn("value");
  }
  
}
