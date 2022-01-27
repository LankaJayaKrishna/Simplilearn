package static_inner_class;
public class Outer3{
    static int data=10;
    static class Inner{
   	 void display() {System.out.println("inner class date="+" " +data);}	 
    }
    public static void main(String[] args) {
   	 Outer3.Inner i=new Outer3.Inner();
   	 i.display();
    }
}
