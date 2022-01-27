package with_ret_without_arg;

class PersonDetails{
    double salary=100000;
    int bonus;
    double incSalary() {
   	 return (salary+bonus);
    }  
}
public class Person3 {   
    public static void main(String[] args) {
   	 PersonDetails persondetails=new PersonDetails();
   	 persondetails.bonus=5000;
   	 System.out.println(persondetails.incSalary());	 
    }
}

