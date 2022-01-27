import java.util.Scanner;

public class main{
    public static void main(String[] args) {
   	 //class for accessing the elements from a keyboard-Scanner
   	 Scanner sc=new Scanner(System.in);
   	 System.out.println("enter the size of an array");
   	 int size=sc.nextInt();
   	 int a[]=new int[size];
   	 //reading input dynamically from a keyboard
   	 for(int i=0;i<a.length;i++) {
   		 System.out.println("enter the array index value of "+i+" ");
   	 a[i]=sc.nextInt();
   	 }
   	 //accessing the elements in linear fashion
   	 for(int temp:a) {
   		 System.out.print(temp+" ");
   	 }
   	 System.out.println();
   	 System.out.println("the base address is "+a);
   	 
    }
}
