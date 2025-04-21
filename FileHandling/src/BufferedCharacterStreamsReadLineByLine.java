import java.io.*;

public class BufferedCharacterStreamsReadLineByLine {
    public static void main(String args[]) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Example2.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("Data Has been Read from the File Successfully..");
            reader.close(); // Always close the stream

        } catch (IOException e) {
            System.out.println("Error in Reading the File");
            e.printStackTrace();
        }
    }
}
/*
My Name is Sudharshan Nayak 
I Have Completed My Engineering in Computer Science , Graduated in 2024
Data Has been Read from the File Successfully..
*/