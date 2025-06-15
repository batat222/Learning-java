import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scan.nextLine();
		System.out.print('\n'+"Enter your age: ");
		int age = scan.nextInt();
		System.out.print('\n'+"Hello, " + name + ", you are " + age + " years old!");			
	}
}
