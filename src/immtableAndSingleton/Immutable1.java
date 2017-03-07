package immtableAndSingleton;

import java.util.ArrayList;
import java.util.List;

public class Immutable1 {

	private final String spec;
	private final int age;
	private final List<String> food;

	public Immutable1(String species, int age, List<String> food) {
		this.spec = species;
		this.age = age;
		if (food == null) {
			throw new RuntimeException("Food is required");
		}

		this.food = new ArrayList<String>(food);
	}

	public String getSpecies() {
		return spec;
	}

	public int getAge() {
		return age;
	}

	public int getFavoriteFoodsCount() {
		return food.size();
	}

	public String getFavoriteFood(int index) {
		return food.get(index);
	}
}
