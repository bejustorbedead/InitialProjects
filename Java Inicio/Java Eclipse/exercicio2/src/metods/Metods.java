package metods;

public class Metods {
	public String name;
	public double grossSalary, tax;
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", NetSalary());
	}
}
