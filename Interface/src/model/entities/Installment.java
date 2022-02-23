package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {

	private Date dueDate;
	private Double amount;

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Installment() {

	}

	public Installment(Date dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return sdf.format(dueDate) + " - " + String.format("%.2f", amount);
	}

}
