import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double a = scan.nextDouble();
		System.out.print("\nEnter second number: ");
		double b = scan.nextDouble();
		System.out.print("\nChoose operation +, -,*, /): ");
		String operator = scan.next();
		double r = 0;
		boolean f = false;
		switch(operator){
			case("+"):
				r = a+b;
				break;
			case("-"):
				r = a-b;
				break;
			case("*"):
				r = a*b;
				break;
			case("/"):
				if(b!=0)
					r = a/b;
				else
					f = true;
				break;
		}
		if(!f)	
			System.out.println("\nResult: " + r);
		else
			System.out.println("Error: Dividing by zero is not allowed!");
	}
}
