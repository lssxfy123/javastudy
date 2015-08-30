package class_test6;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		System.out.println("The area of circle of radius " 
		+ circle.getRadius() + " is " + circle.getArea());
		
		circle.setRadius(5.4);
		
		System.out.println("The area of circle of radius " 
		+ circle.getRadius() + " is " + circle.getArea());
		
		System.out.println("The number of objects created is " 
		+ Circle.getNumberOfObjects());
		
		// �������Ϊ�βΣ����ݵ�Ϊ���������
		// �ڷ������޸�circle��radius_����Ӱ��
		// ��ʵ�ε�radius_
		modifyRadius(circle);
		System.out.println("The area of circle of radius " 
		+ circle.getRadius() + " is " + circle.getArea());
		
	}
	
	// �������Ϊ�β�
	public static void modifyRadius(Circle circle) {
		circle.setRadius(circle.getRadius() + 1);
	}
}
