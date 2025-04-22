import java.io.*;
import java.util.*;
import java.sql.*;
public class JDBCCRUDDynamicProgram {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/Student_info";
        String uname = "root";
        String pass = "root123";
        
        System.out.println("Enter Your Choice:->");
        System.out.println("1.Insert Data  2.Fetch Data  3.Update Data   4.Delete Data");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: insertData(url, uname, pass, sc);
                    break;
            case 2: fetchData(url, uname, pass);
                    break;
            case 3: updateData(url, uname, pass, sc);
                    break;
            case 4: deleteData(url, uname, pass, sc);
                    break;
            default:
                System.out.println("Invalid Entry. Please Enter again!");
                return;
        }
        sc.close();

	}
	
	public static void insertData(String url,String uname,String  pass, Scanner sc) throws Exception {
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    System.out.println("Connection to The Database has been Extablished Successfully...");

	    String sql = "INSERT INTO STUDENT(Name, Register_Number, Age, Branch) VALUES (?, ?, ?, ?)";
	    PreparedStatement pst = con.prepareStatement(sql);

	    sc.nextLine(); // 🔥 Add this line to consume leftover newline

	    System.out.println("Enter the Name: ");
	    String Name = sc.nextLine();

	    System.out.println("Enter The Register Number: ");
	    int Register_Number = sc.nextInt();
	    sc.nextLine(); // Optional: good habit

	    System.out.println("Enter The Age: ");
	    int Age  = sc.nextInt();
	    sc.nextLine(); // Optional: good habit

	    System.out.println("Enter the Branch");
	    String Branch = sc.nextLine();

	    pst.setString(1, Name);
	    pst.setInt(2, Register_Number);
	    pst.setInt(3, Age);
	    pst.setString(4, Branch);
	    pst.executeUpdate();

	    System.out.println("The Values have Been Inserted to the Database Successfully...");
	}

	
	public static void fetchData(String url,String  uname,String  pass)throws Exception {
		Connection con = DriverManager.getConnection(url, uname, pass);
		System.out.println("Connection to The Database has been Extablished Successfully...");
		String sql = "SELECT * FROM STUDENT";
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		System.out.println("The Values Present in the Table are :-> ");
		while(rs.next()) {
			String name = rs.getString("Name");
			int RegisterNumber = rs.getInt("Register_Number");
			int age = rs.getInt("Age");
			String branch_name = rs.getString("Branch");
			System.out.println(name+"--"+RegisterNumber+"--"+age+"--"+branch_name);
			
		}
	}
	
	public static void updateData(String url, String uname, String pass, Scanner sc) throws Exception{
		 Connection con = DriverManager.getConnection(url, uname, pass);
		 System.out.println("Connection to The Database has been Extablished Successfully...");
	       
	       String sql = "UPDATE STUDENT SET Name = ? WHERE Register_Number = ?";
	       PreparedStatement pst = con.prepareStatement(sql);
	       
	       System.out.println("Enter Register Number No to Update:");
	       int Register_Number = sc.nextInt();
	       sc.nextLine();
	       
	       System.out.println("Enter the New Name");
	       String Name = sc.nextLine();
	       
	       pst.setString(1, Name);
	       pst.setInt(2, Register_Number);
	       
	       pst.executeUpdate();
	       System.out.println("Record Updated Successfully!");
	}
	public static void deleteData(String url, String uname, String pass, Scanner sc) throws Exception{
		Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Established: " + con);
        
        String sql = "DELETE FROM STUDENT WHERE Register_Number = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        
        System.out.println("Enter Register Number to Delete:");
        int registerNumber = sc.nextInt();
        
        pst.setInt(1, registerNumber);
        pst.executeUpdate();

        System.out.println("Record Deleted Successfully!");
        
	}

}

/*
Enter Your Choice:->
1.Insert Data  2.Fetch Data  3.Update Data   4.Delete Data
1
Connection to The Database has been Extablished Successfully...
Enter the Name: 
Sudharshan Nayak
Enter The Register Number: 
100
Enter The Age: 
25
Enter the Branch
CSE
The Values has Been Inserted to the Database Sucessfully...

Enter Your Choice:->
1.Insert Data  2.Fetch Data  3.Update Data   4.Delete Data
1
Connection to The Database has been Extablished Successfully...
Enter the Name: 
Shashank PS
Enter The Register Number: 
101
Enter The Age: 
24
Enter the Branch
CSE
The Values has Been Inserted to the Database Sucessfully...

Enter Your Choice:->
1.Insert Data  2.Fetch Data  3.Update Data   4.Delete Data
1
Connection to The Database has been Extablished Successfully...
Enter the Name: 
Shreyas Rai
Enter The Register Number: 
103
Enter The Age: 
26
Enter the Branch
CSE
The Values has Been Inserted to the Database Sucessfully...

Enter Your Choice:->
1.Insert Data  2.Fetch Data  3.Update Data   4.Delete Data
1
Connection to The Database has been Extablished Successfully...
Enter the Name: 
Vineeth P
Enter The Register Number: 
104
Enter The Age: 
24
Enter the Branch
CSE
The Values has Been Inserted to the Database Sucessfully...

Enter Your Choice:->
1.Insert Data  2.Fetch Data  3.Update Data   4.Delete Data
2
Connection to The Database has been Extablished Successfully...
The Values Present in the Table are :-> 
Sudharshan Nayak--100--25--CSE
Shashank PS--101--24--CSE
Shreyas Rai--103--26--CSE
Vineeth P--104--24--CSE

Enter Your Choice:->
1.Insert Data  2.Fetch Data  3.Update Data   4.Delete Data
3
Connection to The Database has been Extablished Successfully...
Enter Register Number No to Update:
104
Enter the New Name
Nitheesh
Record Updated Successfully!

Enter Your Choice:->
1.Insert Data  2.Fetch Data  3.Update Data   4.Delete Data
2
Connection to The Database has been Extablished Successfully...
The Values Present in the Table are :-> 
Sudharshan Nayak--100--25--CSE
Shashank PS--101--24--CSE
Shreyas Rai--103--26--CSE
Nitheesh--104--24--CSE

Enter Your Choice:->
1.Insert Data  2.Fetch Data  3.Update Data   4.Delete Data
4
Connection Established: com.mysql.cj.jdbc.ConnectionImpl@d2de489
Enter Register Number to Delete:
104
Record Deleted Successfully!

Enter Your Choice:->
1.Insert Data  2.Fetch Data  3.Update Data   4.Delete Data
2
Connection to The Database has been Extablished Successfully...
The Values Present in the Table are :-> 
Sudharshan Nayak--100--25--CSE
Shashank PS--101--24--CSE
Shreyas Rai--103--26--CSE


*/