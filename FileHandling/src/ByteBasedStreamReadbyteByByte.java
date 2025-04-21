import java.util.*;
import java.io.*;
public class ByteBasedStreamReadbyteByByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream in = new FileInputStream("Example1.txt");
			int data;
			while((data = in.read()) != -1) {
				System.out.print((char)data);
			}
		}catch(IOException e) {
			System.out.println("Error While Reading the Data...");
			e.printStackTrace();
		}
	}

}
/* OUTPUT 
My Name is Sudharshan Nayak 
*/
