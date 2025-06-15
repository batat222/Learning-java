import java.util.Scanner;
public class test {
	public static void main(String[] args){
		int[] arr = new int[5];
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < 5; i++){
			System.out.print("\nNumber " + (i+1) + ": ");
			arr[i] = scan.nextInt();
			sum += arr[i];
			if(arr[i] < min)
				min = arr[i];
			if(arr[i] > max)
				max = arr[i];
		}		
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + (sum/5.0));
		System.out.println("Largest: " + max);
		System.out.println("Smallest: " + min);
	}
}
