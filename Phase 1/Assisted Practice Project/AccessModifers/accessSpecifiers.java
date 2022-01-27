import pack1.publicspecifier;

class privatespecifier 
{ 
   private void display() 
    { 
        System.out.println("private access specifier"); 
    } 
} 
class defaultSpecifier
{ 
  void display() 
     { 
         System.out.println("Default Access Specifier"); 
     } 
} 


public class accessSpecifiers {
	public static void main(String[] args) {
		defaultSpecifier obj = new defaultSpecifier(); 		  
	    obj.display();
	    publicspecifier obj1 = new publicspecifier(); 
        obj1.display(); 
        privatespecifier  obj3 = new privatespecifier();  
        //obj3.display();
        //if we tried to access private data from a another class it shows as object not visible
	}
}
