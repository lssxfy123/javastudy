package interface_test2;

import java.util.Date;

public class House implements Cloneable, Comparable<House>{
	private int id;
	private double area;
	private Date builtDate;
	
	public House(int id, double area) {
		this.id = id;
		this.area = area;
		builtDate = new Date();
	}
	
	public int getId() {
		return id;
	}
	
	public double getArea() {
		return area;
	}
	
	public Date getBuiltDate() {
		return builtDate;
	}
	
	// ��Ҫ����Object�е�clone����
	// ��Ϊ��Object��clone��protected
	// ���ⲿ�޷�����
	public Object clone() throws CloneNotSupportedException {
		// ����Object���е�clone����������ʵ�ֽӿ�Cloneable
		// �ӿ�Cloneable�Ǹ���ǽӿڣ�û��������ͳ��󷽷�
		return super.clone();
	}
	
	public int compareTo(House o) {
		
		if (area > o.getArea()) {
			return 1;
		} else if (area < o.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}

}
