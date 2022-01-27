package typecasting;
public class typeCasting {

	public static void main(String[] args) {
		
	
		System.out.println("Implicit Type Casting");
		char a='J';
		System.out.println("char: "+a);
		
		int b=a;
		System.out.println("int: "+b);
		
		float c=a;
		System.out.println("float: "+c);
		
		long d=a;
		System.out.println("long: "+d);
		
		double e=a;
		System.out.println("double: "+e);
					
		System.out.println("Explicit Type Casting");
		//explicit conversion
		
		double x=13.25;
		int y=(int)x;
		System.out.println("double: "+x);
		System.out.println("int: "+y);
		
	}
}
