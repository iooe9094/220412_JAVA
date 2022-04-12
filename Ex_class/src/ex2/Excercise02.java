package ex2;

import java.util.Scanner;

public class Excercise02 {

	public static void main(String[] args) {
		// 클래스 작성 해보기
		// 세 과목의 점수를 입력 받아 성적 평균을 출력
		Scanner sc = new Scanner(System.in);

		System.out.println("수학, 과학, 영어 순으로 3개의 정수 입력");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		
		// 아래 클래스를 작성하세요
		Grade me = new Grade();
		System.out.println("평균은 " + me.average(math, science, english));
	}

}
