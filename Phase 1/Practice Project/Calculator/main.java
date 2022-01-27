import java.util.Scanner;
public class main {
	public static void main(String[] args)
	{
		double a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		a= sc.nextDouble();
		b = sc.nextDouble();
		System.out.println("Enter the operator (+,-,*,/)");
		char op = sc.next().charAt(0);
		double ans = 0;
		switch (op) {
		case '+':
			ans = a + b;
			break;
		case '-':
			ans = a - b;
			break;
		case '*':
			ans = a*b;
			break;
		case '/':
			ans = a/b;
			break;
		default:
			System.out.println("wrong input");
		}
		System.out.println("result:");
		System.out.println(a + " " + op + " " + b + " = " + ans);
	}
}



