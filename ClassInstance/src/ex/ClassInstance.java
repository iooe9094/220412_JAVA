package ex;

public class ClassInstance {
	
	public static class StaticTest {
		static int classVar = 10;
		int instanceVar = 20;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    System.out.println("===변경전===");
		// StaticTest 객체 1
		StaticTest staticTest1 = new StaticTest();
		// StaticTest 객체 2
		StaticTest staticTest2 = new StaticTest();
		
	    System.out.println("1." + StaticTest.classVar + ","
	                       + staticTest1.instanceVar);
	    
	    System.out.println("2." + StaticTest.classVar + ","
	    		+ staticTest2.instanceVar);
	    
	    // 값을 변경
	    staticTest1.classVar = 12; // 객체1 classVar 값 변경
	    staticTest1.instanceVar = 400; // 객체1 instantce 값 변경
	    System.out.println("===변경후===");
	    
	    System.out.println("1." + staticTest1.classVar + ","
	    		           + staticTest1.instanceVar);
	    System.out.println("2." + staticTest2.classVar + ","
	    		+ staticTest2.instanceVar);
	}
}
