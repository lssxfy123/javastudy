package wrap_class_test3;

import java.math.BigDecimal;
import java.math.BigInteger;

public class WrapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("100! is \n" + factorial(100));
		
		BigDecimal a = new BigDecimal(2);
		BigDecimal b = new BigDecimal(3);
		
		// 小数点保留20位，舍入方式向下舍入
		// 0.66666666666666666666
		BigDecimal c = a.divide(b, 20, BigDecimal.ROUND_DOWN);
		
		System.out.println(c);
	}
	
	// 求大数阶乘
	public static BigInteger factorial(long n) {
		BigInteger result = BigInteger.ONE;
		
		for (int i = 1; i <= n; i++) {
			// BigInteger的构造函数中，int形参的构造函数为private，不可见
			result = result.multiply(new BigInteger(i + ""));
		}
		return result;
	}

}
