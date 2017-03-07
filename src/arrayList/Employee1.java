package arrayList;

public class Employee1 {

	private int empID;
	private String efName;
	private String elName;
	private String age;

	public int getId() {
		return empID;
	}

	public void setId(int id) {
		this.empID = id;
	}

	public String getfName() {
		return efName;
	}

	public Employee1(int id, String fName, String lName, String age) {
		this.empID = id;
		this.efName = fName;
		this.elName = lName;
		this.age = age;
	}

	public void setfName(String fName) {
		this.efName = fName;
	}

	public String getlName() {
		return elName;
	}

	public void setlName(String lName) {
		this.elName = lName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [id=" + empID + ", efName=" + efName + ", elName=" + elName + ", age=" + age + "]";
	}
}
