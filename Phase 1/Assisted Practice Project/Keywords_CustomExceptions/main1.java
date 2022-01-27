package thRow;

public class main1
{
    public static void main(String[] args)
    {

        int a=100,b=0,res;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                res = a / b;
                System.out.print("The result is : " + res);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\nError : " + Ex.getMessage());
        }
    }
}
