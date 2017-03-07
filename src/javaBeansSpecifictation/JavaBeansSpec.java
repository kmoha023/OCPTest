package javaBeansSpecifictation;

public class JavaBeansSpec {

	private int id;
	private String fName;
	private boolean status;
	
	
	public int getId() {
		return id;
	}
	
	public String getfName() {
		return fName;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.fName = name;
	}
	
	public void setResultValue(boolean status) {
		this.status = status;
	}
	
	public static void main(String[] args) {
		
		JavaBeansSpec jb1 = new JavaBeansSpec();
		
	}
}
