package member_inner_class;

public class Outer2 {
    class Inner{
   	 void display() {
   		 System.out.println("This is Inner class");
   	 }    
    }
	public static void main(String[] args) {
   	 Outer2 out=new Outer2();
   	 Outer2.Inner in=out.new Inner();
   	 in.display();
   	 
    }
}
