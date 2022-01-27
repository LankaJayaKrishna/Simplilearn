package anonymous_inner_class;

abstract class Bike{
abstract void speed();    
}
public class Outer {  
	public static void main(String[] args) {
   	 Bike b=new Bike() {
   		 void speed() {
   			 System.out.println("the speed of bike is 120km /hr");
   		 }
   	 };
   	 b.speed();
    }
}
