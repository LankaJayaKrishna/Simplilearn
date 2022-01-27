package parameterizedconstructor;
//this type of constructor is used to provide values
class Student{  
int id;  
String name; 
public Student(int i, String string) {
	id=i;
	name= string;
}
void display(){System.out.println(id+" "+name);}   
public static void main1 (String args[]){    
Student s1=new Student(123,"jay");  
Student s2=new Student(456,"krishna");    
s1.display();  
s2.display();  
}  
}  

 