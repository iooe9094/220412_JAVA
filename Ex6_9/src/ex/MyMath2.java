package ex;

public class MyMath2 {
	// 일반변수(인스턴스변수)
	long a, b;

	// 일반메소드(인스턴스메소드) - 뒤 매개변수 없음
	long add() {return a + b;}
	long subtract() {return a - b;}
	long multiply() {return a * b;}
	double divide() {return a / b;} // 소수이므로 double
	
	// 전역메소드(클래스변수 정의) - 뒤 매개변수 있음
	static long add(long a, long b) { return a + b; }
	static long subtract(long a, long b) { return a - b; }
	static long multiply(long a, long b) { return a * b; }
	static double divide(long a, long b) { return a / (double)b; }
}
