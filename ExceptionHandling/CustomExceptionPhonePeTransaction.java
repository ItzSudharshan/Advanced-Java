import java.util.*;
//Payment takes too much time 
class PaymentTimeoutException extends Exception{
	public PaymentTimeoutException(String message) {
		super(message);
	}
}

//Upi invalid 
class InvalidUPIException  extends Exception{
	public InvalidUPIException(String message) {
		super(message);
	}
}


public class CustomExceptionPhonePeTransaction {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] transactions = {"Txn1", "Txn2", "Txn3", "Txn4"};
		for(String txn: transactions) {
			try {
				 processTransaction(txn);
			}catch(PaymentTimeoutException e) {
				System.out.println("Print Timeout for "+txn+" : "+e.getMessage());
			}catch(InvalidUPIException e) {
				System.out.println("Invalid UPI ID for "+txn+" : "+e.getMessage());
			}catch(Exception e) {
				 System.out.println("Unexpected error with " + txn + ": " + e.getMessage());
			}
		}
		  System.out.println("All transactions have been processed. Thank you for using PhonePe! 📱✨");
	}
	
	public static void processTransaction(String txn) throws PaymentTimeoutException, InvalidUPIException{
		if(txn.equals("Txn2")) {
			throw new PaymentTimeoutException("The Transaction took long time");
		}else if(txn.equals("Txn3")) {
			throw new InvalidUPIException("The Upi ID Entered is Invalid");
		}else if(txn.equals("Txn4")) {
			throw new NullPointerException("The Transaction Details are Missing");
		}else {
			System.out.println(txn + " processed successfully!");
		}
	}

}
/*
 * Txn1 processed successfully!
Print Timeout for Txn2 : The Transaction took long time
Invalid UPI ID for Txn3 : The Upi ID Entered is Invalid
Unexpected error with Txn4: The Transaction Details are Missing
All transactions have been processed. Thank you for using PhonePe! 📱✨
*/
