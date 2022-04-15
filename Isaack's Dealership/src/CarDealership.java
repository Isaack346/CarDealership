import java.util.Scanner;
public class CarDealership {
public static void main(String[] args) {
	Scanner response = new Scanner(System.in);
		String option;
		String yes;
		String name;
		String liscense;
		String insurance;
		int budget;
		int credit;
		int value;
		// declared my variables above
	System.out.println("Welcome to Isaack's Car Delearship!");
	 System.out.println("Please type out 'b' to buy a car and 's' to sell a car");
	 option = response.next();
	 // asked user to type b or s to see whether they wanted to buy or sell
	switch(option) {
	// using a switch because we have only 2 cases and switch fits well
	 case "b" : 
		 System.out.println("What is your budget? ");
		 budget = response.nextInt();
		 if(budget >= 10000) {
			 System.out.println("Great! A 2010 Honda Civic is available.");
			 System.out.println("Do you have a valid driver's liscense? Write 'yes or 'no' ");
			 liscense = response.next();
			 System.out.println("Do you have insurance? Write 'yes or 'no' ");
			 insurance = response.next();
			 System.out.println("What is your credit score? ");
			 credit = response.nextInt();
			 // getting user input above
			 if (liscense.equals("yes") && insurance.equals("yes") && credit >= 600) {
				 System.out.println("Great! Everything looks good.\nYou are now the official owner of the 2010 Honda Civic!" );
                 }
			 else {
				 System.out.println("We're sorry you're not eligible. ");
				 // using if and else to see if user input matches to what i want else  they are not eligible
			 }
		 }
			 else {
				System.out.println("We don't sell cars under $10,000 dollars.") ;
				// else here correlates to if they have below $10,000 dollars
			 }
	    break;
	 case "s" : System.out.println("You choose the option to sell a car");
	 System.out.println("What is the value of you car ?");
	 value = response.nextInt();
	 System.out.println("What is your selling prince?");
	 int price = response.nextInt();
	 // getting user input
	 if(value>price && price < 30000) {
		 System.out.println("Perfect!We  would love to buy your car.");
		 // using if to see if their response is what i am looking for so that i can buy their car
	 }
	 else {
		 System.out.println("Sorry but your selling price is a little to high for use would have to pass.");
		 // else not buying
	 }
	       break;
	 default: System.out.println("Invalid option!");
	          break;
	          // my default here is for if they put a response other than b and s then i will have a statement saying invalid
	          }
	 
		
	}
	{
	}
	}