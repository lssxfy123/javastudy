package interface_test1;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object [] objects = new Object[3];
		objects[0] = new Chicken();
		objects[1] = new Apple();
		objects[2] = new Tiger();
		
		for (int i = 0; i < objects.length; i++) {
			// ʹ��instanceof������ж��Ƿ���չ�˽ӿ�Edible
			// �ӿڼ̳к���̳к�����
			if (objects[i] instanceof Edible) {
				System.out.println("Edible is " + ((Edible)objects[i]).isEdible());
			}
			
			if (objects[i] instanceof Method) {
				System.out.println("Eat method is " + ((Method)objects[i]).howToEat());
			}
		}
	}

}

class Animal {
	
}

class Tiger extends Animal {
	
}

// ֻ�ܼ̳�һ���࣬��������չ����ӿ�
class Chicken extends Animal implements Edible , Method {
	public boolean isEdible() {
		return true;
	}
	
	public String howToEat() {
		return "Chicken:Fry it";
	}
}

abstract class Fruit implements Edible {
	
}

class Apple extends Fruit {
	public boolean isEdible() {
		return true;
	}
}
