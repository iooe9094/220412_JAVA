package ex;

public class Ex6_9 {

	public static void main(String[] args) {

		// MyMath2 클래스 전역 메소드(전역 변수) 호출 : 객체 생성 필요 없음
		// MyMath2.java 파일을 읽어와 호출할 수 있기 때문이다.
	    // MyMath2의 타입이 long이므로 숫자 뒤 L 붙인다.
		
	    System.out.println(MyMath2.add(200L, 100L));
	    System.out.println(MyMath2.subtract(200L, 100L));
	    System.out.println(MyMath2.multiply(200L, 100L));
	    System.out.println(MyMath2.divide(200L, 100L));
	    
	    // new 객체 생성해서 쓰는 인스턴스메소드(일반메소드)
	    MyMath2 mm = new MyMath2();
	    mm.a = 200L;
	    mm.b = 100L;
	    
	    // 인스턴스 메서드는 위와 같이 객체 생성(new) 후 사용 가능
	    System.out.println(mm.add());
	    System.out.println(mm.subtract());
	    System.out.println(mm.multiply());
	    System.out.println(mm.divide());
	}

}
