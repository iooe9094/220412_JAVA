package ex;

public class Exercise01 {

	public static void main(String[] args) {
		// 다음과 같이 출력되도록 TV 클래스를 작성하시오.
		// 출력값 : LG에서 만든 2017년형 32인치 TV
		
// 첫 번째 방법
		TV myTv = new TV();
		// instance로 불러올 경우
		myTv.show("LG", 2017, 32); // instance는 객체 생성해야 불러올 수 있음
		
		// static으로 불러올 경우
	    TV.show("aa", 1, 1); // static은 객체 생성 없이 불러올 수 있음
	    
// 두 번째 방법
//	    myTv.show();
	}

}
