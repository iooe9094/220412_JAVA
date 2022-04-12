package ex;

public class TV {
	// 인스턴스변수 : 문자열 brand
	// 인스턴스변수 : 정수 year
	// 인스턴스변수 : 정수 inch
	// show 메소드를 작성
	// 출력함수 작성 show : brand에서 만든 year년형 inch인치 TV
	
// 두 번째 방법
//    String brand = "LG";
//    int year = 2017;
//    int inch = 32;
//    
//    void show() {
//    	System.out.println(brand + "에서 만든 " + year + "년형 " + inch + "인치 TV");
//    }
	
// 첫 번째 방법 (가장 방식 좋음. 의존성주입 : Dependency injection DI)
// 소스가 변경되어도 수정이 필요가 없으므로 장점
	static void show(String brand, int year, int inch) {
		System.out.println(brand + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
}

