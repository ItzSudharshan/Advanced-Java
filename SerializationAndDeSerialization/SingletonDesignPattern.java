import java.io.*;
import java.util.*;

public class SingletonDesignPattern {

	public static void main(String[] args) {
		Sun1 s1 = Sun1.getObject();
		Sun1 s2 = Sun1.getObject();
		Sun1 s3 = Sun1.getObject();

		System.out.println("The Singleton pattern ensures a class has only one instance and provides a global"
						   + "point of access to it. Serialization can unintentionally break this pattern by creati"
						   + "new instances during deserialization.");
		System.out.println("Only one Object is Created and Hence the hashcode for all 3 is the Same..");
		System.out.println("S1 Hashcode: " + s1.hashCode());
		System.out.println("S2 Hashcode: " + s2.hashCode());
		System.out.println("S3 Hashcode: " + s3.hashCode());

		System.out.println("The Total Number of Objects Created would be " + Sun1.count);
	}
}

class Sun1 {
	static int count = 0;
	static Sun1 obj;

	private Sun1() {
		count++;
		System.out.println("Constructor was Called and Object was Created...");
	}

	public static Sun1 getObject() {
		if (count == 0) {
			obj = new Sun1();
		} else {
			System.out.println("No New Object was Created...");
		}
		return obj;
	}
}
/*
Constructor was Called and Object was Created...
No New Object was Created...
No New Object was Created...
The Singleton pattern ensures a class has only one instance and provides a globalpoint of access to it. Serialization can unintentionally break this pattern by creatinew instances during deserialization.
Only one Object is Created and Hence the hashcode for all 3 is the Same..
S1 Hashcode: 474675244
S2 Hashcode: 474675244
S3 Hashcode: 474675244
The Total Number of Objects Created would be 1
*/