package enum1;

public class Order1 {

	private Status orderStatus = Status.NEW;

	public void setOrderStatus(Status orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Status getOrderStatus() {
		return orderStatus;
	}

	public static void main(String[] args) {
		Order1 order = new Order1();
		order.setOrderStatus(Status.ACCEPTED);
		System.out.println(Status.CANCELLED.ordinal());
		for (Status status : Status.values()) {
			System.out.println(status);
		}
		Status shipped = Status.valueOf("SHIPPED");
		System.out.println(shipped);

		System.out.println(Season.FALL.getLevel());

	}
}
