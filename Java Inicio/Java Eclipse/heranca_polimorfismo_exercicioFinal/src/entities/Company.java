package entities;

public class Company extends TaxPayer{
	private int numberOfEmployees;

	public Company() {
		super();
	}
	
	public Company(String name, Double anualCome, int numberOfEmployees) {
		super(name, anualCome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		if (numberOfEmployees > 10) {
			return super.getAnualCome() * 0.14;
		} else {
			return super.getAnualCome() * 0.16;
		}
	}
}
