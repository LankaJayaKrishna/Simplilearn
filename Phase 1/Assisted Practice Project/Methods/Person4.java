package without_arg_without_ret;

class PersonDetails{
double salary=100000;
int bonus;
    void incSalary() {
   	 System.out.println(salary+bonus);
    }   
}
public class Person4 {
    public static void main(String[] args) {
   	 PersonDetails persondetails=new PersonDetails();
   	 persondetails.bonus=5000;
   	 persondetails.incSalary();
    }
}
