package ex;
class Data3 { int x; } // 예제6-6~

public class ex6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// 예제6-3
//		// Card 클래스
//		// 클래스명.변수 : 전역변수 호출 방법
//		// new : 객체 생성 안함
//		System.out.println("Card.width = " + Card.width);
//		System.out.println("Card.height = " + Card.height);
//		
////		인스턴스변수(일반변수)는 다른 객체에 영향 없음
//		Card c1 = new Card();
//		c1.kind = "Heart";
//		c1.number = 7;
//		
//		Card c2 = new Card();
//		c2.kind = "Spade";
//		c2.number = 4;
//		
//		// 인스턴스변수(일반변수)
//		System.out.println("c1은 " + c1.kind + "," + c1.number +
//				"이며, 크기는 (" + c1.width + "," + c1.height + ")");
//		System.out.println("c2은 " + c2.kind + "," + c2.number +
//				"이며, 크기는 (" + c2.width + "," + c2.height + ")");
//		
//		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
//		
//		// 전역변수(클래스변수) 변경/ c2도 바뀔것인지?
//		// class Card에서 static 값으로 width, height 되어있음.
//		c1.width = 50;
//		c1.height = 80;
//		
//		// 일반변수(인스턴스변수), 전역변수(클래스변수)
//		System.out.println("c1은 " + c1.kind + "," + c1.number +
//				"이며, 크기는 (" + c1.width + "," + c1.height + ")");
//		System.out.println("c2은 " + c2.kind + "," + c2.number +
//				"이며, 크기는 (" + c2.width + "," + c2.height + ")");
//	}
//}
//
//class Card {
//	String kind;
//	int number;
//	static int width = 100;
//	static int height = 250;
//}
		
// 예제6-4
//	     MyMath mm = new MyMath();
//	     long result1 = mm.add(5L, 3L);
//	     long result2 = mm.subtract(5L, 3L);
//	     long result3 = mm.multiply(5L, 3L);
//	     double result4 = mm.divide(5L, 3L);
//	     
//	     System.out.println("add(5L, 3L) = " + result1);
//	     System.out.println("subtract(5L, 3L) = " + result2);
//	     System.out.println("multiply(5L, 3L) = " + result3);
//	     System.out.println("divide(5L, 3L) = " + result4);
//	}
//}
//
//// 사칙연산을 위한 클래스 설명 
//class MyMath {
//	// 멤버 메소드(인스턴스 메소드)
//	long add(long a, long b) {
//		long result = a + b;
//		return result;
//		// 위의 두 줄을 return a+b로 축약 가능
//	}
//	long subtract(long a, long b) { return a - b; }
//	long multiply(long a, long b) { return a * b; }
//	double divide(double a, double b) {
//		return a / b;
		
// 예제6-5
//		System.out.println("Hello");
		
// 예제6-6
//		// Data 클래스의 객체 생
//		Data d = new Data();
//		// 객체 d의 인스턴스변수 x = 10
//		d.x = 10;
//		
//		// 첫 번째 출력
//		System.out.println("main() : x = " + d.x);
//		
//		// 두 번째 출력 
//		change(d.x);
//		
//		// 세 번째 출력
//		// change() 메소드를 호출하고 변수 d.x 값이 나오는지?를 묻는 
//		System.out.println("After change(d.x)");
//		System.out.println("main() : x = " + d.x);
//	}
//	
//	// 전역 메소드
//	// 매개변수 : 기본형 (정수)
//	static void change(int x) { // 리턴값없음. 전역메소드(static)
//		// 매개변수 x에 1000으로 값을 변경
//		x = 1000;
//		System.out.println("change() : x = " + x);
		
// 예제6-7
//		Data2 d = new Data2();
//		d.x = 10;
//		System.out.println("main() : x " + d.x);
//					
//		change(d);
//		System.out.println("After change(d)");
//		System.out.println("main() : x " + d.x);
//	}
//	
//	    // 매개변수가 객체일 경우(참조형) 값을 변경하면 영구적으로 변경됨
//	    // 기본형(정수, 실수, 문자형 등)일 경우 값을 변경하면 원본에 영향이 없음
//	    static void change(Data2 d) {
//		d.x = 1000; // 이 때 부터 영구적으로 1000의 값으로 변경 / 원본 영향 
//		System.out.println("change() : x " + d.x);
		
// 예제6-8
		Data3 d = new Data3();
		d.x = 10;
		
		// Data3 클래스의 객체 d를 매개변수로 넘김
		Data3 d2 = copy(d);
		
		// 메모리 주소 복사
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	}
	
	static Data3 copy(Data3 d) {
		Data3 tmp = new Data3();
		tmp.x = d.x;
		return tmp;
	}
}
