package ocptest;

public class Product extends Order{

	private int productId;
	private String description;
	private double price;

	public Product(int i, String d, double p) {

		productId = i;
		description = d;
		price = p;
	}

	public int getItem() {
		return productId;
	}

	public String getDesc() {
		return description;
	}

	public double getPrice() {
		return price;
	}
}
