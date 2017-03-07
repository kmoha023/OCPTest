package ocptest;

public class OrderTaker {

	    private static int custID = 200;
	    private String inputName="";
	    private String inputAddress="";
	    private static int orderInput;
	    private static int qty;
	    private static int orderNum;
	     
	    public OrderTaker(int id, String input, double value) {
	    
	    	
		}

		public static void main (String[] args){
	     
	    OrderTaker[] item = new OrderTaker[4];
	    item[0] = new OrderTaker(10, "order1 for item1", 11.95);
	    item[1] = new OrderTaker(14, "order2 for item2", 8.55);
	    item[2] = new OrderTaker(56, "order3 for item3", 4.97);
	    item[3] = new OrderTaker(52, "order4 for item4", 5.9);
	 
	    }
	}
