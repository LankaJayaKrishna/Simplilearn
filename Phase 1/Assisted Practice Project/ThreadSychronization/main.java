import java.io.*; 
import java.util.*; 
class Send
{ 
    public static void send(String msg) 
    { 
        System.out.println("Sending\t"  + msg ); 
        try
        { 
            Thread.sleep(1000); 
        } 
        catch (Exception e) 
        { 
            System.out.println("Thread  interrupted."); 
        } 
        System.out.println("\n" + msg + "Sent"); 
    } 
} 
class ThreadedSend extends Thread 
{ 
    private String msg; 
    private Thread t; 
    Send  sender; 
    ThreadedSend(String m,  Send obj) 
    { 
        msg = m; 
        sender = obj; 
    } 
  
    public void run() 
    {  
        synchronized(sender) 
        { 
            Send.send(msg); 
        } 
    } 
} 
class Sync 
{ 
    public static void main(String args[]) 
    { 
        Send snd = new Send(); 
        ThreadedSend S = new ThreadedSend( " mphasis " , snd ); 
        S.start(); 
        try
        { 
            S.join(); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Interrupted"); 
        } 
    } 
} 
