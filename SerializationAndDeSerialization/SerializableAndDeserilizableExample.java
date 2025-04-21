import java.io.*;
import java.util.*;
class Student implements Serializable{
	private String name;
	private int Roll_Number;
	
	public Student(String name, int Roll_Number) {
		this.name = name;
		this.Roll_Number = Roll_Number;
	}
	public String getName() {
		return name;
	}
	
	public int getRollNumber() {
		return Roll_Number;
	}
}
public class SerializableAndDeserilizableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Sudharshan", 414);
		try {
			FileOutputStream fileOut = new FileOutputStream("user.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(student);
			System.out.println("Data Has been Serialized to user.ser....");
		}catch(IOException e) {
			System.out.println("Serialization Failed...");
			e.printStackTrace();
		}
		System.out.println("Deserilization in Process...");
		try {
			FileInputStream fileIn = new FileInputStream("user.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			Student student1 = (Student)in.readObject();
			System.out.println("Deserialization Successfull...");
			System.out.println("The Output is ...");
			System.out.println("Name: "+student1.getName()+" Roll Number: "+student1.getRollNumber());
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
/*
Data Has been Serialized to user.ser....
Deserilization in Process...
Deserialization Successfull...
The Output is ...
Name: Sudharshan Roll Number: 414
*/