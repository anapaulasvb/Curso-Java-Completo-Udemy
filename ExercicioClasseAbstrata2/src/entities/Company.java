package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer setNumberOfEmployees() {
		return numberOfEmployees;
	}

	@Override
	public Double tax() {
		if (numberOfEmployees <= 10) {
			return getAnualIncome() * 0.16;
		} else {
			return getAnualIncome() * 0.14;
		}
	}
	
	public String toString() {
		return getName() + ": $ " + String.format("%.2f", tax());
	}

}
