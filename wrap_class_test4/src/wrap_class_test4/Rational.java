package wrap_class_test4;

public class Rational extends Number implements Comparable {
	private long numerator = 0;  // ����
	private long denomiator = 1;  // ��ĸ
	
	public Rational() {
		// TODO Auto-generated constructor stub
		this(0, 1);
	}
	
	public Rational(long numerator, long denomiator) {
		// TODO Auto-generated constructor stub
		long gcd = gcd(numerator, denomiator);
		
		// ͨ��
		this.numerator = ((denomiator > 0) ?1:-1) * numerator / gcd;
		this.denomiator = Math.abs(denomiator) / gcd;
	}
	
	public long getNumerator() {
		return numerator;
	}
	
	public long getDenomiator() {
		return denomiator;
	}
	
	public Rational add(Rational secondRational) {
		// ��ʽ���
		long n = numerator * secondRational.getDenomiator()
				+ denomiator * secondRational.getNumerator();
		
		long d = denomiator * secondRational.getDenomiator();
		return new Rational(n, d);
	}
	
	public Rational subtract(Rational secondRational) {
		// ��ʽ���
		long n = numerator * secondRational.getDenomiator()
				- denomiator * secondRational.getNumerator();
		
		long d = denomiator * secondRational.getDenomiator();
		return new Rational(n, d);
	}
	
	public Rational multiply(Rational secondRational) {
		// ��ʽ���
		long n = numerator * secondRational.getNumerator();
		long d = denomiator * secondRational.getDenomiator();
		return new Rational(n, d);
	}
	
	public Rational divide(Rational secondRational) {
		// ��ʽ���
		long n = numerator * secondRational.getDenomiator();
		long d = denomiator * secondRational.getNumerator();
		return new Rational(n, d);
	}
	
	// ���Զ�����
	public String toString() {
		if (denomiator == 1) {
			return numerator + "";
		} else {
			return numerator + "/" + denomiator;
		}
	}
	
	public boolean equals(Object o) {
		if (this.subtract((Rational)o).getNumerator() == 0) {		
			return true;
		} else {
			return false;
		}
	}
	
	public int intValue() {
		return (int)intValue();
	}
	
	public float floatValue() {
		return (float)doubleValue();
	}
	
	public double doubleValue() {
		return numerator * 1.0 / denomiator;
	}
	
	public long longValue() {
		return (long)doubleValue();
	}
	
	public int compareTo(Object o) {
		if (this.subtract((Rational)o).getNumerator() > 0) {
			return 1;
		} else if (this.subtract((Rational)o).getNumerator() < 0) {
			return -1;
		}
		
		return 0;
	}
	
	// �����Լ��
	private static long gcd(long n, long d) {
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		long gcd = 1;
		
		for (int i = 1; i <= n1 && i <= n2; i++) {
			if ((n1 % i == 0) && (n2 % i == 0)) {
				gcd = i;
			}
		}
		
		return gcd;
	}
}
