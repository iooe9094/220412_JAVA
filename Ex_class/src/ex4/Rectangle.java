package ex4;

public class Rectangle {
	int x;
	int y;
	int width;
	int height;
	
	// 사각형 좌표 구하는 메소드
	public void show(int x, int y) {
		System.out.println("rect의 좌표는 (" + x + "," + y + ")");
	}
	
//  void show() {
//	   System.out.println("rect의 좌표는 (" + x + "," + y + ")");
// }

	// 사각형 넓이 계산하는 메소드
	public int square(int width, int height) {
		return (int)(width * height);
	}
	
//	int square() {
//	return width * height;
// }

}
