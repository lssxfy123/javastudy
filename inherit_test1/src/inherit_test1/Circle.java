package inherit_test1;

public class Circle extends GeometricObject {  // ��ļ̳�
	private double radius;
//	public Circle(double radius) {
//		// TODO Auto-generated constructor stub
//	}
	
	public Circle(double radius, String color, boolean filled) {
		// TODO Auto-generated constructor stub
		// ���������ʾ��ͨ��super�ؼ���������
		// ����Ĺ��캯����ԭ���Ǹ���û�ж���
		// �޲ι��캯�����������C++
		super(color, filled);  // ���������ǰ��
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadus(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
}