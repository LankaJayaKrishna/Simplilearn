package encapsulation;
class PersonDetails{
    double salary;
    PersonDetails(double salary) {
   	 this.salary=salary;
    }
    void display() {
   	 System.out.println(salary);
    } 
}
public class main {   
    public static void main(String[] args) {
   	 PersonDetails person1=new PersonDetails(5000);
   	 PersonDetails person2=new PersonDetails(15000);
   	 person1.display();
   	 person2.display();
    }
}
