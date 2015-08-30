package object_test3;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1 = new Course("Data Structures");
		course1.addStudents("Peter");
		course1.addStudents("Smith");
		course1.addStudents("John");
		course1.addStudents("Jo");
		course1.addStudents("Tony");
		
		System.out.println("Number of students in " 
		+ course1.getCourseName() + " is " + course1.getNumberOfStudents());
		
		String [] students = course1.getStudents();
		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i] + " ");
		}
		
		System.out.println();
		
		course1.dropStudent("Smith");
		
		students = course1.getStudents();
		
		System.out.println("Number of students in " 
		+ course1.getCourseName() + " is " + course1.getNumberOfStudents());
		
		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i] + " ");
		}
		System.out.println();
		
		course1.addStudents("Willan");
		
		students = course1.getStudents();
		
		System.out.println("Number of students in " 
		+ course1.getCourseName() + " is " + course1.getNumberOfStudents());
		
		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i] + " ");
		}
		
		System.out.println();
		
		course1.clear();
		
		System.out.println("Number of students in " 
		+ course1.getCourseName() + " is " + course1.getNumberOfStudents());
	}

}

class Course {
	private String courseName;
	private String [] students;
	private int numberOfStudents;
	
    public Course(String courseName) {
		// TODO Auto-generated constructor stub
    	this.courseName = courseName;
	}
    
    public void addStudents(String student) {
    	++numberOfStudents;
    	
    	if (numberOfStudents > 1) {
			String [] temp = new String[numberOfStudents];
			
			for (int i = 0; i < students.length; i++) {
				temp[i] = students[i];
			}
			
			temp[numberOfStudents - 1] = student;
			students = temp;
		}
    	else {
    		students = new String[numberOfStudents];
    		students[numberOfStudents - 1] = student;
		}
		
	}
    
    public String [] getStudents() {
		return students;
	}
    
    public int getNumberOfStudents() {
		return numberOfStudents;
	}
    
    public String getCourseName() {
		return courseName;
	}
    
    public void dropStudent(String student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == student) {
				String [] temp = new String[students.length - 1];
				
				for (int j = 0; j < i; j++) {
					temp[j] = students[j];
				}
				
				for (int j = i + 1; j < students.length; j++) {
					temp[j - 1] = students[j];
				}
				
				--numberOfStudents;
				students = temp;
			}
		}
	}
    
    public void clear() {
		numberOfStudents = 0;
		students = null;
	}
}
