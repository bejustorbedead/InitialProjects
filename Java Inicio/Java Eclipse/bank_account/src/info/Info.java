package info;

public class Info {
	
	private int accnum;
	private String holder;
	private double initial_value;
	
	public Info(int accnum, String holder) {
		this.accnum = accnum;
		this.holder = holder;
	}
	
	public Info(int accnum, String holder, double initial_value) {
		this.accnum = accnum;
		this.holder = holder;
		this.initial_value = initial_value;
	}

	public int getAccnum() {
		return accnum;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getInitial_value() {
		return initial_value;
	}
	
	public void depositValue(double amount) {
		initial_value += amount;
	}
	
	public void withDrawValue(double amount) {
		initial_value -= amount + 5.0;
	}
	
	public String toString() {
		return "Account: " + accnum + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", initial_value);
	}
	
}
