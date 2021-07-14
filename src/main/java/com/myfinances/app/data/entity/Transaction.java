package com.myfinances.app.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.myfinances.app.data.AbstractEntity;

/**
 * This entity represents a transaction in the application.
 * 
 * @author Kálley Wilkerson
 */
@Entity(name = "transaction")
@Table(name = "transaction")
public class Transaction
  extends AbstractEntity {

  /**
   * This is the value of the transaction.
   */
  @Column(name = "value", nullable = false)
  Double value;

  /**
   * Default constructor.
   */
  protected Transaction() {
    super();
  }

  /**
   * @return {@link #value}
   */
  public Double getValue() {
    return value;
  }

  /**
   * @param value update {@link #value}.
   */
  public void setValue(Double value) {
    this.value = value;
  }

}
