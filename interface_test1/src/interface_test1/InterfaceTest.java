package interface_test1;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object [] objects = new Object[3];
		objects[0] = new Chicken();
		objects[1] = new Apple();
		objects[2] = new Tiger();
		
		for (int i = 0; i < objects.length; i++) {
			// 使用instanceof运算符判断是否扩展了接口Edible
			// 接口继承和类继承很相似
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

// 只能继承一个类，但可以扩展多个接口
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
