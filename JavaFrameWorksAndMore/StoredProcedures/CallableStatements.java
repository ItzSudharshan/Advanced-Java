import java.util.*;
import java.io.*;
import java.sql.*;
public class CallableStatements {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 String url = "jdbc:mysql://localhost:3306/student_dynamicCrud";
	     String uname = "root";
	     String pass = "root123";
	     
	     Connection con = DriverManager.getConnection(url, uname, pass);
	     
	     System.out.println("Enter the Student Name:");
	     String name = sc.nextLine();
	     
	     System.out.println("Enter the Roll Number: ");
	     int  roll_number = sc.nextInt();
	     sc.nextLine();
	     
	    System.out.println("Enter the Branch Name: ");
	    String branchName = sc.nextLine();
	    
	    System.out.println("Enter the Student Age:");
	    int age = sc.nextInt();
	    
	    String sql = "{CALL InsertVal(?,?,?,?)}";
	    
	    CallableStatement cs = con.prepareCall(sql);
	    cs.setString(1, name);
	    cs.setInt(2, roll_number);
	    cs.setString(3, branchName);
	    cs.setInt(4, age);
	    cs.execute();
	    
	    System.out.println("Value has Been Inserted..");
	    System.out.println("Updated Table is As Follows...");
	    String sql1 = "SELECT * FROM  Student_Info";
	    PreparedStatement ps = con.prepareStatement(sql1);
	    ResultSet rs = ps.executeQuery();
	    while(rs.next()) {
	    	String Name = rs.getString("Student_name");
	    	int rollNumber = rs.getInt("Roll_no");
	    	String Branch = rs.getString("Branch_Name");
	    	int Age = rs.getInt("Student_Age");
	    	System.out.println("NAME: "+Name+"-- Roll Number: "+rollNumber+"-- Branch Name: "+Branch+"-- AGE: "+Age);
	    }
	    rs.close();
        ps.close();
        cs.close();
        con.close();
        sc.close();

	}

}
/*
 * Enter the Student Name:
Sudharshan Nayak
Enter the Roll Number: 
100
Enter the Branch Name: 
Computer Science and Engineering
Enter the Student Age:
25
Value has Been Inserted..
Updated Table is As Follows...
NAME: Sudharshan Nayak-- Roll Number: 100-- Branch Name: Computer Science and Engineering-- AGE: 25
----------------
Enter the Student Name:
Shreyas Rai
Enter the Roll Number: 
104
Enter the Branch Name: 
Computer Science and Engineering 
Enter the Student Age:
25
Value has Been Inserted..
Updated Table is As Follows...
NAME: Sudharshan Nayak-- Roll Number: 100-- Branch Name: Computer Science and Engineering-- AGE: 25
NAME: Shashank PS-- Roll Number: 101-- Branch Name: Computer Science and Engineering -- AGE: 25
NAME: Vineeth P-- Roll Number: 102-- Branch Name: Computer Science and Engineering -- AGE: 24
NAME: Shreyas Rai-- Roll Number: 104-- Branch Name: Computer Science and Engineering -- AGE: 25


*/
