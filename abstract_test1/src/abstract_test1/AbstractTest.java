package abstract_test1;

public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GeometricObject object = new Circle(5.0, "red", false);
		displayGeometricObject(object);

	}
	
	// �ڳ������ж�����󷽷��ĺô��������������Ϊ�β�
	// ���û�г��󷽷������޷������������еĸ��Ƿ���
	public static void displayGeometricObject(GeometricObject object) {
		System.out.println("The area is " + object.getArea());
		System.out.println("The perimeter is " + object.getPerimeter());
	}
	
}
