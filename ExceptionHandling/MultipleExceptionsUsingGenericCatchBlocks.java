import java.util.*;
public class MultipleExceptionsUsingGenericCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array: ");
		for(int i = 0 ; i< size; i++) {
			try {
				arr[i] = sc.nextInt();
			}catch(Exception e){
				if(e instanceof InputMismatchException) {
					System.out.println("Error Occured ...Please Enter Only Integers.");
				}else if(e instanceof ArrayIndexOutOfBoundsException) {
					System.out.println("Error Occured ...Array Index Out of Bounds.");
				}else {
					System.out.println("Unexpected Error Has Occured..");
				}
			}
		}
		
		System.out.println("Input Entered Successfully..");
	}

}
/*
Enter the Size of the Array: 
4
Enter the Elements of the Array: 
1
2
3
Four
Error Occured ...Please Enter Only Integers.
Input Entered Successfully..
----------------------
*/