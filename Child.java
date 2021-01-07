package Spring2018;
//2018 spring 2a
//can you override private or static method

class Parent{
	private void method1() {
		System.out.println("private parent method 1");
	}
	static void method2() {
		System.out.println("static parent method 2"); 
	}

}
public class Child extends Parent{
	void method1() {
		System.out.println("child  method 1");
	}
	static void method2() {
		System.out.println("child method 2 ");
	}
	public static void main(String[] args) {
		Parent c=new Child();
		//c.method1();	//compile error, but can override using inner class which extends outer class and access
						//access member of outer class
		c.method2(); //this calls parent static method2 instead of child method2, so no overriding
	}

}
