package com.myfinances.app.data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * This is the basic structure that a database entity must have in this
 * application
 * 
 * @author Kálley Wilkerson
 */
@MappedSuperclass
public abstract class AbstractEntity {

  /**
   * The identifier of the object.
   */
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  private Long id;

  /**
   * @return {@link #id}
   */
  public Long getId() {
    return id;
  }

  /**
   * Sets {@link #id}.
   * 
   * @param id The new value.
   */
  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public int hashCode() {
    if (id != null) {
      return id.hashCode();
    }
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof AbstractEntity)) {
      return false; // null or other class
    }
    AbstractEntity other = (AbstractEntity) obj;

    if (id != null) {
      return id.equals(other.id);
    }
    return super.equals(other);
  }
}
