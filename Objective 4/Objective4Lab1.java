import java.util.Scanner;

public class Objective4Lab1 
{
	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		String fname = "";
		String lname = "";
		String favoriteAnimal = "";
		String favoriteFood = "";
		String favoriteSong = "";
		
		//First name
		System.out.println("What is your first name?");
		fname = keyboard.nextLine();
		
		//Last name
		System.out.println("What is your last name?");
		lname = keyboard.nextLine();
		
		//Favorite animal
		System.out.println("What is your favorite animal?");
		favoriteAnimal = keyboard.nextLine();
		
		//Favorite food
		System.out.println("What is your favorite food?");
		favoriteFood = keyboard.nextLine();
		
		//Favorite song
		System.out.println("What is your favorite song?");
		favoriteSong = keyboard.nextLine();
		
		//Output
		System.out.println("My name is " + fname + " " + lname + ".");
		System.out.println("My favorite animal is the " + favoriteAnimal + ".");
		System.out.println("My favorite food is " + favoriteFood + ".");
		System.out.println("My favorite song is " + favoriteSong + ".");
  }
}