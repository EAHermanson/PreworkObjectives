public class Objective2Lab3 
{
  public static void main(String[] args) 
  {
	
//	  Declare an int variable for the year you were born.
	  int birthYear = 1983;
			  
//	  Declare a String variable for the month you were born.
	  String birthMonth = "December";
			  
//	  Declare a variable for whether today is a weekend or not.
	  boolean isWeekend = false;
	  
//	  Print out each of the three variables.
	  System.out.println(
			  	Integer.toString(birthYear) + '\n' + // Needed to cast to string because otherwise the \n would get added mathematically instead of concatonating
			  	birthMonth + '\n' +
			  	isWeekend
			  );
	  
  }
}