import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateEmployee {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String driver, url, user, password;
		
		driver = "com.mysql.cj.jdbc.Driver";
	    url = "jdbc:mysql://localhost:3306/edb12634";
	    user = "root";
	    password = "root";
	    
	    String updateQuery = "update employee set name=? , email=?, mobile=?, salary=?,where id=1";
	    Scanner in = new Scanner(System.in);
	    System.out.println("Please enter id: ");
	    int id = in.nextInt();
	    
	    System.out.println("Please enter name: ");
	    String  name = in.next();
	    
	    
	    System.out.println("Please enter email: ");
	    String  email = in.next();
	    
	    
	    System.out.println("Please enter mobile: ");
	    long  mobile = in.nextLong();
	    
	    
	    System.out.println("Please enter salary: ");
	    double  salary = in.nextDouble();
	    
	    
	    
	    
	    //1. Loading Driver (optional)
	   // Class.forName(driver);
	    
	    //2.Establish Connection 
	    Connection con = DriverManager.getConnection(url, user, password);
	    
	    //3. Create Prepared Statement
	    PreparedStatement st =  con.prepareStatement(updateQuery);
	 
	    st.setString(1, name);
	    st.setString(2, email);
	    st.setLong(3, mobile);
	    st.setDouble(4, salary);
	    st.setInt(5, id);;
	    
	    //4. Process Insert Query
	    int status = st.executeUpdate();
	    if(status >=1) {
	    	System.out.println("Success");
	    }else {
	    	System.out.println("Failed");
	    }
	    
	  
	    //5. Close resources
	    st.close();
	    con.close();
	   
	    
	}
	
}
