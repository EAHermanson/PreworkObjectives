import java.util.Scanner;

public class Objective5Lab4 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int inputNumber;

		System.out.println("Please enter a number:");
		inputNumber = scanner.nextInt();
		
		System.out.print("The number is ");
		
		if(inputNumber % 2 == 0)
		{
			System.out.print("even");
		}
		else
		{
			System.out.print("odd");
		}
		
		scanner.close();
	}
}