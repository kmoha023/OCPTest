package enum1;

public enum Season {

		WINTER("Low"),
		SPRING("High"),
		SUMMER("Low"),
		FALL("Low");
		
		
		
		 //constructor
	private String level;

	private Season(String level) {
		this.level = level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getLevel() {
		return level;
	}
}
