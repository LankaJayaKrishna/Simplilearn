package fiNally;


public class main
    {
        public static void main(String[] args)
        {
            int a=5,b=0,res=0;
            try
            {
                res = a / b;
            }
            catch(ArithmeticException Ex)
            {
                System.out.print("Error : " + Ex.getMessage());
            }
            finally
            {
                System.out.print("\nThe result is : " + res);
            }
        }
    }
