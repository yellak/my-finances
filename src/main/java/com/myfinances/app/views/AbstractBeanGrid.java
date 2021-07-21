package com.myfinances.app.views;

import com.myfinances.app.data.AbstractEntity;
import com.vaadin.flow.component.grid.Grid;

/**
 * Abstract Grid to list objects.
 * 
 * @author Kálley Wilkerson
 * @param <T> Type of the grid.
 */
@SuppressWarnings("serial")
public abstract class AbstractBeanGrid<T extends AbstractEntity>
  extends Grid<T> {

  /**
   * Constructor method.
   * 
   * @param beanType The type of the bean.
   */
  public AbstractBeanGrid(Class<T> beanType) {
    this(beanType, false);
  }

  /**
   * @param beanType          Type of the bean.
   * @param autoCreateColumns Indicates if the grid has to create the columns
   *                          automatically
   */
  protected AbstractBeanGrid(Class<T> beanType, boolean autoCreateColumns) {
    super(beanType, autoCreateColumns);
    addClassName("bean-grid");
  }

}
