import java.util.*;  
public class main {  
public static void main(String args[]){  
          Scanner in = new Scanner(System.in);  
          System.out.print("Enter the email.ID: ");  
          String email = in.nextLine();         
          in.close();             
          ArrayList al=new ArrayList();   
	      al.add("abc@gmail.com");
	      al.add("efg@gmail.com");
	      al.add("hij@gmail.com");
	      al.add("klm@gmail.com");
	      al.add("nop@gmail.com");
	      if (al.contains(email)){
	    	System.out.println("email avaiable");
	       }
	      else {
	    		System.out.println("email unavaiable");
	       }
}
}