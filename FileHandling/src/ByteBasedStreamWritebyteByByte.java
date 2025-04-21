import java.util.*;
import java.io.*;
public class ByteBasedStreamWritebyteByByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "I have Completed My Engineering from St Joseph Engineering College in 2024";
		try {
			FileOutputStream out = new FileOutputStream("Example1.txt");
			out.write(data.getBytes());
			System.out.println("Data Has been Written to File Successfully...");
		}catch(IOException e) {
			System.out.println("Error when Writing the Data to the File...");
			e.printStackTrace();
		}
		
		System.out.println("The Data Present in the File Now is ...");
		try {
			FileInputStream in = new FileInputStream("Example1.txt");
			int data1;
			while((data1 = in.read()) != -1) {
				System.out.print((char)data1);
			}
		}catch(IOException e) {
			System.out.println("Error While Reading the Data...");
			e.printStackTrace();
		}

	}

}
/*
Data Has been Written to File Successfully...
The Data Present in the File Now is ...
I have Completed My Engineering from St Joseph Engineering College in 2024
*/