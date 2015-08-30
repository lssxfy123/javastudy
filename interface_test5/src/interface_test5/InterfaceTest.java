package interface_test5;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Edible {
	void howToEat();
}

interface Safe extends Edible {
	void safeToEat ();
}

class Chicken implements Edible, Safe {
	public void howToEat() {
		
	}
	
    public void safeToEat() {
		
	}
}
