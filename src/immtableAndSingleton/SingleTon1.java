package immtableAndSingleton;


public class SingleTon1 {

	
	private static volatile SingleTon1 instance = null;

	private SingleTon1() {
	}

	public static synchronized SingleTon1 getInstance() {
		if (instance == null) {
			synchronized (SingleTon1.class) {
				if (instance == null) {
					instance = new SingleTon1();
				}
			}
		}
		return instance;
	}
	
public static void main(String[] args) {
		
		SingleTon1 i1 = SingleTon1.getInstance();
		SingleTon1 i2 = SingleTon1.getInstance();
		System.out.println(i1);
		System.out.println(i2);
	}
}
