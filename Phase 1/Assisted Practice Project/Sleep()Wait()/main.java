class NumberLoop extends Thread{
    //all the thread logics must be written inside a run method
    public void run() {
   	 try {
   		 even();
   	 } catch (InterruptedException e) {
   		 e.printStackTrace();
   	 }
   	
    }
    public void even() throws InterruptedException {
    	 Object LOCK = new Object();
   	 for(int i=2;i<=6;i=i+2) {
   		 System.out.println(i);
   		 Thread.sleep(2000);
   		synchronized (LOCK) 
   	    {
   	        LOCK.wait(2000);
   	        System.out.println("Loop" + " is woken after" + " waiting for 2 second");
   	    }

   	 }
    }	 
   	
}
public class main{
   
    public static void main(String[] args) throws InterruptedException {
   	 NumberLoop loop =new NumberLoop();
   	 loop.start();
   	
    }
}
