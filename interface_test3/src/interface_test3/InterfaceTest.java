package interface_test3;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Chicken();
		eat(animal);  // Fry it
		
		animal = new Duck();
		eat(animal);  // Roast it
	}
	
	// ����һ���ø���������βΣ����Խ������е��������
	public static void eat(Animal animal) {
		System.out.println(animal.howToEat());
	}

}
