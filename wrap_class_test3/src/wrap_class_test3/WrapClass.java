package wrap_class_test3;

import java.math.BigDecimal;
import java.math.BigInteger;

public class WrapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("100! is \n" + factorial(100));
		
		BigDecimal a = new BigDecimal(2);
		BigDecimal b = new BigDecimal(3);
		
		// С���㱣��20λ�����뷽ʽ��������
		// 0.66666666666666666666
		BigDecimal c = a.divide(b, 20, BigDecimal.ROUND_DOWN);
		
		System.out.println(c);
	}
	
	// ������׳�
	public static BigInteger factorial(long n) {
		BigInteger result = BigInteger.ONE;
		
		for (int i = 1; i <= n; i++) {
			// BigInteger�Ĺ��캯���У�int�βεĹ��캯��Ϊprivate�����ɼ�
			result = result.multiply(new BigInteger(i + ""));
		}
		return result;
	}

}
