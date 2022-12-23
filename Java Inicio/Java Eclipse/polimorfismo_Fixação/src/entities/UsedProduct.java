package entities;

public class UsedProduct extends Product{
	private String date;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, String date) {
		super(name, price);
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String priceTag() {
		return super.getName() + " (USED) $ " + super.getPrice() + " (Manufacture day: " + date + ")";
	}
}
