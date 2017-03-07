package ocptest;

public class Order {

	private int orderID;
	protected String custName;
	protected String custAddress;
	private double totalPrice;
	private double shipFee;

	public Order() {
		
		custName = "xyz";
		custAddress = "abc";
		orderID = 0;
		totalPrice = 0.00;
		shipFee = 0.00;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public int getOrderID() {
		return orderID;
	}

	public String getCustName() {
		return custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public double getShipFee() {
		return shipFee;
	}
}
