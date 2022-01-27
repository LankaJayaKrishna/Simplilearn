package with_arg_with_ret;

class PersonDetails{
    double salary=100000;
    double incSalary(int bonus) {
   	 return (salary+bonus);
    }
    
}

public class Person1 {
    
    public static void main(String[] args) {
   	 PersonDetails persondetails=new PersonDetails();
   	 double newsal=persondetails.incSalary(5000);
   	 System.out.println(newsal);
   	 
    }

}
