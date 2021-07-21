package com.myfinances.app.views;

import com.myfinances.app.data.AbstractEntity;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * Abstract Form to edit entities.
 * 
 * @param <T> Type of the bean
 * @author Kálley Wilkerson
 */
public abstract class AbstractBeanForm<T extends AbstractEntity>
  extends Dialog {

  /**
   * Serial UID version.
   */
  private static final long serialVersionUID = 1L;

  /**
   * Bean being edited in this form
   */
  private T bean;

  /**
   * The footer of the form.
   */
  private HorizontalLayout footer;

  /**
   * The button to confirm the form.
   */
  private Button confirmButton;

  /**
   * @param bean The bean to be edited in this form
   */
  public AbstractBeanForm(T bean) {
    super();
    this.bean = bean;
    add(createContent());
    add(createFormFooter());
  }

  /**
   * The footer has the save button and the cancel button.
   * 
   * @return The footer of the form.
   */
  private Component createFormFooter() {
    footer = new HorizontalLayout(createConfirmButton());
    return footer;
  }

  /**
   * @return The button to save the form.
   */
  private Component createConfirmButton() {
    confirmButton = new Button("Ok");
    confirmButton.addClickListener(e -> close());
    return confirmButton;
  }

  /**
   * @return The content to be inside the form.
   */
  protected abstract Component createContent();

  /**
   * @return {@link #bean}
   */
  public T getBean() {
    return bean;
  }

  /**
   * @param bean updates {@link #bean}.
   */
  public void setBean(T bean) {
    this.bean = bean;
  }

  /**
   * @return {@link #footer}
   */
  protected HorizontalLayout getFooter() {
    return footer;
  }

  /**
   * @return {@link #confirmButton}
   */
  protected Button getConfirmButton() {
    return confirmButton;
  }

}
