class NumberLoop extends Thread{
    //all the thread logics must be written inside a run method    
    public void run() {
   	 for(int i=0;i<10;i++) {
   		 System.out.println(i);
   	 }
    }
}
public class main{
    public static void main(String[] args) {
   	 NumberLoop loop=new NumberLoop();
   	 //start a thread
   	 loop.start();
    }
}
