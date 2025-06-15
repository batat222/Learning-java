import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double a = scan.nextInt();
		System.out.print('\n' + "Enter second number: ");
		double b = scan.nextInt();
		System.out.println('\n' + "Sum: " + (a+b));
		System.out.println("Dif: " + (a-b));
		System.out.println("Prod: " + (a*b));
		System.out.println("Div: " + (a/b));
	}
}
