package object_test1;

import java.util.Date;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(1, "John");
		System.out.println(student.toString());
	}

}

class Student {
	private int id_;
	private String name_;
	private Date date_;
	
	public Student(int id, String name) {
		id_ = id;
		name_ = name;
		date_ = new Date();
	}
	
	public int getId() {
		return id_;
	}
	
	public String getName() {
		return name_;
	}
	
	public Date getDate() {
		return date_;
	}
}
