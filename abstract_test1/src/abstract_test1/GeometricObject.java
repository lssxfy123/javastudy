package abstract_test1;

import java.util.Date;

public abstract class GeometricObject {  // 抽象类
	private String color = "white";
	private boolean filled;
	private Date date;
	
    protected GeometricObject(String color, boolean filled) {
		// TODO Auto-generated constructor stub
    	this.color = color;
    	this.filled = filled;
    	date = new Date();
	}
    
    public String getColor() {
		return color;
	}
    
    public void setColor(String color) {
		this.color = color;
	}
    
    public boolean isFilled() {
		return filled;
	}
    
    public void setFilled(boolean filled) {
		this.filled = filled;
	}
    
    public Date getDate() {
		return date;
	}
    
    public String toString() {
		return "Created on " + date + "\ncolor: " + color 
				+ " and filled: " + filled;
	}
    
    public abstract double getArea();  // 抽象方法
    
    public abstract double getPerimeter();  // 抽象方法
}

