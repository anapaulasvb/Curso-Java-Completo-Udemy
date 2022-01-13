package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Client client;

	private List<OrderItem> items = new ArrayList<>();

	public Order() {

	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public Client getClient() {
		return client;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public Double total() {
		Double total = 0.0;

		for (OrderItem list : items) {
			total = list.subTotal() + total;
		}

		return total;
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items: \n");

		for (OrderItem list : items) {
			sb.append(list.getProduct());
			sb.append(", $");
			sb.append(String.format("%.2f", list.getPrice()));
			sb.append(", Quantity: ");
			sb.append(list.getQuantity());
			sb.append(", Subtotal: $");
			sb.append(String.format("%.2f", list.subTotal()) + "\n");
		}

		sb.append("Total price: $");
		
		sb.append(String.format("%.2f", total()));

		return sb.toString();
	}

}
