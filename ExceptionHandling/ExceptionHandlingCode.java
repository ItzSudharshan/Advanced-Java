import java.util.*;
public class ExceptionHandlingCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numerator = 10;
		int denominator = 0;
		try {
			int result = numerator / denominator;
			System.out.println("Result: "+result);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Error Handled .. Error ..You cannot divide "+e.getMessage());
		}
		System.out.println("Program continues to Run Smoothly ");
	}

}
/*
Error Handled .. Error ..You cannot divide / by zero
Program continues to Run Smoothly 
*/