package Spring2018;
//1a
public class WrapperDemo {

	public static void main(String[] args) {
		int x=10;
		//autoboxing
		Integer obj1=new Integer (5);
		Integer obj2=Integer.valueOf(x);
		//unboxing
		int num1=obj1.intValue();
		int num2=obj2.intValue();
		
		System.out.println("Integer in obj1=" +num1 );
		System.out.println("Integer in obj2=" +num2);
		

	}

}
