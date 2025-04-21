import java.io.*;
public class BufferedCharacterStreamsWriteLineByLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("Example2.txt"));
			writer.write("I am Proficient in Java , HTML , CSS , Js as well as React");
			writer.newLine();
			writer.write("Additionally i am also aware of Database Technologies such as MySql and MongoDb");
			System.out.println("Writing to File Completed...");
			writer.close();
		}catch(IOException e) {
			System.out.println("Error in Writing File...");
			e.printStackTrace();
		}
		
		System.out.println("Displaying the Contents from the file...");
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Example2.txt"));
			String line;
			while((line = reader.readLine()) != null){
				System.out.println(line);
			}
			
			System.out.println("Reading from the file is Completed...");
			
		}catch(IOException e) {
			System.out.println("Error While reading the file...");
			e.printStackTrace();
		}

	}

}
/*
Writing to File Completed...
Displaying the Contents from the file...
I am Proficient in Java , HTML , CSS , Js as well as React
Additionally i am also aware of Database Technologies such as MySql and MongoDb
Reading from the file is Completed...
*/