package ocptest;

public class JavaDataModel {

	private int custId;
	private String FirstName;
	private String LastName;
	private int age;
	  
	
	public JavaDataModel(int custId, String FirstName, String LastName, int age){
		
		this.custId = custId;
		this.FirstName = FirstName;
		this.LastName= LastName;
		this.age = age;
		
	}
	
	public int getAge() {
		return age;
	}
	
	public int getCustId() {
		return custId;
	}
	
	
	public String getLastName() {
		return LastName;
	}
	
	
	public String getFirstName() {
		return FirstName;
	}
	
	
	@Override
	public String toString() {
		return "Customer [id=" + custId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		
		
		
	}
	
}
