package with_arg_without_ret;
class PersonDetails{
    double salary=100000;
    void incSalary(int bonus) {
   	 System.out.println(salary+bonus);
    }
}
public class Person2 {   
    public static void main(String[] args) {
   	 PersonDetails persondetails=new PersonDetails();
   	 persondetails.incSalary(5000);	 
    }
}
