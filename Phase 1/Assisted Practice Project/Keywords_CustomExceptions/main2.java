package thRows;
public class main2
{
    void Division() throws ArithmeticException
    {
        int a=1,b=0,res;
         res = a / b;
        System.out.print("The result is : " + res);
    }
     public static void main(String[] args)
    {
main2 T = new main2();
         try
        {
            T.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\nError : " + Ex.getMessage());
        }
    }
}
