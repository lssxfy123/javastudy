package typeconvert;

public class TypeConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		double j = i;
		System.out.println(j);
		
		double a = 3.45;
		int k = (int)a;
		System.out.println(k);
		System.out.println(String.valueOf(a));
		// int k = a;  // error，必须进行显示类型转换
		boolean b = true;
	}

}
