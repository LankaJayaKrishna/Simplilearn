import java.util.*;
public class main {
	public static void main(String[] args) {
		//Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(111,"jay");    
	      hm.put(222,"krishna");    
	      hm.put(333,"usha");   
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+"   "+m.getValue());    
	      }
	     //HashTable
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      ht.put(444,"sri");  
	      ht.put(555,"raj");  
	      ht.put(666,"babu");   
	      System.out.println("\nThe elements of HashTable are ");  
	      for(int k:ht.keySet())
			{
				System.out.println(k+"   "+ht.get(k));}
	      //TreeMap
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(777,"vijay");    
	      map.put(888,"laxmi");    
	      map.put(999,"ashi");       
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+"   "+l.getValue());    
	      }    
	   }  
	}


