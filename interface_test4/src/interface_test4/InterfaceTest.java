package interface_test4;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edible stuff = new Chicken();  // �ӿ����ͱ������������κ�һ��ʵ���˸ýӿڵ����ʵ��
		eat(stuff);
		
		stuff = new Duck();
		eat(stuff);
		
		stuff = new Apple();
		eat(stuff);
		
	}
	
	public static void eat(Edible stuff) {
		System.out.println(stuff.howToEat());
	}

}

interface Edible {
	public String howToEat();
}

class Chicken implements Edible {
	public String howToEat() {
		return "Fry it";
	}
}

class Duck implements Edible {
	public String howToEat() {
		return "Roast it";
	}
}

class Apple implements Edible {
	public String howToEat() {
		return "Make apple cider";
	}
}
