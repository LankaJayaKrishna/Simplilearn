import java.util.*;

public class collection {

	public static void main(String[] args) {
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList al=new ArrayList();   
	      al.add("sathwik");
	      al.add("ramya");    	   
	      System.out.println(al);  
		
		//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector vec = new Vector();
	      vec.addElement("eshwar"); 
	      vec.addElement("srinu"); 
	      System.out.println(vec);
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList ll=new LinkedList();  
	      ll.add("raj");  
	      ll.add("usha");  	      
	      Iterator itr=ll.iterator();  
	      while(itr.hasNext()){ System.out.println(itr.next());  }
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet hs=new HashSet();  
	       hs.add(123);  
	       hs.add(456);  
	       hs.add(789);
	       hs.add(321);
	       System.out.println(hs);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet lhs=new LinkedHashSet();  
	       lhs.add(111);  
	       lhs.add(222);  
	       lhs.add(333);
	       lhs.add(444);	       
	       System.out.println(lhs);
	      	} 
	      }  
	


