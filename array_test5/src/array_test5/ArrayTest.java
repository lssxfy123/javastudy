package array_test5;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a = "a";
        String b = "b";
        operator(a, b);
        
        String x = new String("x"); 
        String y = new String("y");
        operator(x, y);
        System.out.println(a + "," + b);
        System.out.println(x + "," + y);
	}
	
    public static void operator(String a, String b) {
        a += b;
        b = a;
    }

//    public static void operator(StringBuilder a, StringBuilder b) {
//        a.append(b);
//        b = a;
//    }

}
