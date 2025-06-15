import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		double a = scan.nextInt();
		if(a % 2 == 0){
			System.out.println(a + " is even");
		}
		else {
			System.out.println(a + " is odd")
		}
	}
}
