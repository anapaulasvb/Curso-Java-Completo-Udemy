package entities;

public class Product {

	private String name;
	private Double unitPrice;
	private Integer quantity;

	public Product(String name, Double unitPrice, Integer quantity) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double total() {
		return unitPrice * quantity;
	}
	
	@Override
	public String toString() {
		return "Name: "
				+ name
				+ ", Unit Price: "
				+ unitPrice
				+ ", Quantity: "
				+ quantity;
	}

}
