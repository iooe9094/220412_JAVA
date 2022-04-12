package ex3;

public class Exercise03 {

	public static void main(String[] args) {
		// 해당 클래스 생성하고 인스턴스메소드를 호출해서 아래를 출력
		// 클래스명 : Song
		// 인스턴스변수 : title   = "Dancing Queen"
		//             singer  = "ABBA"
		//             country = "Sweden"
        // 인스턴스 메소드 : show
		// 출력 : "스웨덴 국적의 ABBA가 부른 Dancing Queen"
		
		// 1. 객체 생성 및 create Song 클릭해서 Song 클래스 파일 생성		
		Song mySong = new Song();
		mySong.show("Sweden", "ABBA", "Dancing Queen"); // instance
		
		Song.show("Korea", "BTS", "Dynamite"); // static
	}
}
