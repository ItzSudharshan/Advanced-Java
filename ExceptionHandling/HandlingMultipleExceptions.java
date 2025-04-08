import java.util.*;
public class HandlingMultipleExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] numbers = {"10", "20", "Thirty", "40"};
		int sum = 0;
		for(String num : numbers) {
			try {
			sum += Integer.parseInt(num);
			System.out.println("The Sum is "+sum);
		}catch(NumberFormatException e) {
			System.out.println("Invalid Format Error: "+num);
		}catch(NullPointerException e) {
			System.out.println("Null Value Found: ");
		}

	}
	}
}
/*
 * 
Multiple Catch Blocks can also be used to Handle Multiple Errors
The Sum is 10
The Sum is 30
Invalid Format Error: Thirty
The Sum is 70
*/