import java.util.*;
import java.io.*;
public class FindNumberOfObjectsCreated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sun s1 = new Sun();
		Sun s2 = new Sun();
		Sun s3 = new Sun();
		Sun s4 = new Sun();
		
		System.out.println("Number of Objects is ..."+Sun.obj);
		

	}

}
class Sun{
	static int obj = 0;
	Sun(){
		obj++;
	}
}
/*
Number of Objects is ...4
*/