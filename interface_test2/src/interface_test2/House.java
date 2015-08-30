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
	
	// 需要覆盖Object中的clone方法
	// 因为在Object中clone是protected
	// 在外部无法调用
	public Object clone() throws CloneNotSupportedException {
		// 调用Object类中的clone方法，必须实现接口Cloneable
		// 接口Cloneable是个标记接口，没有数据域和抽象方法
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
