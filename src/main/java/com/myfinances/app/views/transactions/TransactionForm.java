package com.myfinances.app.views.transactions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import com.myfinances.app.data.entity.Transaction;
import com.myfinances.app.data.service.TransactionService;
import com.myfinances.app.views.AbstractBeanForm;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Result;
import com.vaadin.flow.data.binder.ValueContext;
import com.vaadin.flow.data.converter.StringToDoubleConverter;

/**
 * Form to edit transaction entities
 * 
 * @author Kálley Wilkerson
 */
public class TransactionForm extends AbstractBeanForm<Transaction> {

	/**
	 * Serial UID version.
	 */
	private static final long serialVersionUID = 6335207845150188499L;

	/**
	 * Service to deal with transactions in the database.
	 */
	private TransactionService service;

	/**
	 * @param bean The object to be edited in this form.
	 */
	public TransactionForm(TransactionService service, Transaction bean) {
		super(bean);
		this.service = service;
		getConfirmButton().addClickListener(e -> save());
	}

	/**
	 * Saves the bean in the data base.
	 */
	private void save() {
		service.save(getBean());
	}

	@Override
	protected Component createContent() {
		FormLayout form = new FormLayout();
		form.setResponsiveSteps(new ResponsiveStep("50px", 1), new ResponsiveStep("450px", 2));
		form.add(createValueField());
		return form;
	}

	/**
	 * @return The field to edit the value of the transaction.
	 */
	private Component createValueField() {
		TextField value = new TextField();
		value.setLabel("Value");
		value.addValueChangeListener(e -> {
			Result<Double> res = new StringToDoubleConverter("Couldn't convert to Double").convertToModel(e.getValue(),
					new ValueContext());
			getBean().setValue(res.getOrThrow(msg -> new IllegalArgumentException(msg)));
		});
		return value;
	}

}
