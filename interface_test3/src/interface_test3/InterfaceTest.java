package interface_test3;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Chicken();
		eat(animal);  // Fry it
		
		animal = new Duck();
		eat(animal);  // Roast it
	}
	
	// 方法一般用父类对象做形参，可以接收所有的子类对象
	public static void eat(Animal animal) {
		System.out.println(animal.howToEat());
	}

}
