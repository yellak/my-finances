package com.myfinances.app.views.transactions;

import com.myfinances.app.data.entity.Transaction;
import com.myfinances.app.data.service.TransactionService;
import com.myfinances.app.views.MainLayout;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

/**
 * View of the transactions.
 * 
 * @author Kálley Wilkerson
 */
@Route(value = "transactions", layout = MainLayout.class)
@PageTitle(TransactionView.PAGE_TITLE)
public class TransactionView
  extends Div {

  /**
   * Serial UID version.
   */
  private static final long serialVersionUID = -6777282279218519517L;

  /**
   * Title of the page.
   */
  public static final String PAGE_TITLE = "Transactions";

  /**
   * Transaction service to deal with transactions
   */
  private TransactionService service;

  /**
   * Constructor method.
   * 
   * @param service Service of the transactions.
   */
  public TransactionView(TransactionService service) {
    super();
    this.service = service;
    addClassName("transactions-view");
    setSizeFull();
    add(createGrid());
    add(createEditButton());
  }

  /**
   * @return A button to edit a transaction
   */
  private Component createEditButton() {
    return new Button("Insert", e -> new TransactionForm(service, new Transaction()).open());
  }

  /**
   * @return The Grid to list the transactions
   */
  private Component createGrid() {
    TransactionGrid grid = new TransactionGrid();
    grid.setItems(service.findAll());
    return grid;
  }

}
