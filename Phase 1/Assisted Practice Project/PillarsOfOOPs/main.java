package abstraction;

abstract class Calcultor{
    public abstract void sum(int a,int b);
    public abstract void sub(int a,int b);
    public abstract void mul(int a,int b);
    public abstract void div(int a,int b);
    void m() {	 
    }
}
class CalImp extends Calcultor{
    public void sum(int a, int b) {
   	 System.out.println(a+b);
    }
    public void sub(int a, int b) {
   	 System.out.println(a-b);
    }
    public void mul(int a, int b) {
   	 System.out.println(a*b);
    }
    public void div(int a, int b) {
   	 System.out.println(a/b);
    }
}
public class main{
    public static void main(String[] args) {
   	 CalImp imp=new CalImp();
   	 imp.sum(12, 13);
   	 imp.sub(14, 11);
    }
}


