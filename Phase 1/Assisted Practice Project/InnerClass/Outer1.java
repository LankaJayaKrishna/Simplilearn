package local_inner_class;
public class Outer1{
    int speed=50;
    void display() {
       class Inner{
   	       void show() {System.out.println("this is Inner class "+speed);}
        }    
     System.out.println("this is Outer class");    
     Inner i=new Inner();
   	 i.show();	 
    }
    public static void main(String[] args) {
   	 Outer1 out=new Outer1();
   	 out.display();	 
    }
}
