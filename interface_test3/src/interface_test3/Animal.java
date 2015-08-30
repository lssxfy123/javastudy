package interface_test3;

// ≥ÈœÛ¿‡
public abstract class Animal {
	public abstract String howToEat();
}

class Chicken extends Animal {
	public String howToEat() {
		return "Fry it";
	}
}

class Duck extends Animal {
	public String howToEat() {
		return "Roast it";
	}
}
