package entities;

public class Purchase {

	private int id;
	private int quantity;

	public int getId() {
		return id;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Purchase(int id, int quantity) {
		this.id = id;
		this.quantity = quantity;
	}
	
	public double price() {
		switch (id) {
			case 1001: return quantity * 1000.00;
			case 1002: return quantity * 2000.00;
			case 1003: return quantity * 50.00;
			default: return quantity * 200.00;
		}
	}
	
	public String toString() {
		return "ID: "
				+ id
				+ ", quantity: "
				+ quantity
				+ ", total: $"
				+ String.format("%.2f", price());
	}

}
