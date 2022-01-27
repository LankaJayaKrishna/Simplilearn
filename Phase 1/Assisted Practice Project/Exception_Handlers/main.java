// class representing custom exception  
class CustomException  extends Exception  
{  
    public CustomException (String str)  
    {  
        super(str);  
    }  
}  
// class that uses custom exception InvalidAgeException  
public class main  
{  
    // method to check the age  
    static void validate (int age) throws CustomException{    
       if(age < 18){  
        // throw an object of user defined exception  
        throw new CustomException("age is not valid to vote");    
    }  
       else {   
        System.out.println("welcome to vote");   
        }   
     }    
  
    // main method  
    public static void main(String args[])  
    {  
        try  
        {  
            // calling the method   
            validate(13);  
        }  
        catch (CustomException ex)  
        {  
            System.out.println("Caught the exception");  
    
            // printing the message from InvalidAgeException object  
            System.out.println("Exception occured: " + ex);  
        }
    }  
}  