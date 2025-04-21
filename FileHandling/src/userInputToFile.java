import java.io.*;
import java.util.*;
public class userInputToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Text to Enter into the File....(Enter Exit if You want to Exit)");
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("Example3.txt"));
			
			while(true) {
				String input = sc.nextLine();
				if(input.equalsIgnoreCase("exit")) {
					break;
				}
				writer.write(input);
				writer.newLine();
			}
			writer.close();
			System.out.println("User Input has been written to the File Successfully...");
			
		}catch(IOException e) {
			System.out.println("Error in Writing to the File..");
			e.printStackTrace();
		}
		
		System.out.println("The Text Content Present in the File after Writing is:");
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Example3.txt"));
			
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
		}catch(IOException e) {
			System.out.println("Error in Reading the File");
			e.printStackTrace();
		}
		
		

	}

}
/*
 * Enter the Text to Enter into the File....(Enter Exit if You want to Exit)
My Name is Sudharshan Nayak 
I am From St Joseph Engineering College 
i Have Completed my Engineering in Computer Science and Engineering
Gradudated from 2024 Batch 
exit
User Input has been written to the File Successfully...
The Text Content Present in the File after Writing is:
My Name is Sudharshan Nayak 
I am From St Joseph Engineering College 
i Have Completed my Engineering in Computer Science and Engineering
Graduated from 2024 Batch
*/
