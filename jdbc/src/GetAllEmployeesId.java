import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetAllEmployeesId {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String driver, url, user, password;
		
		driver = "com.mysql.cj.jdbc.Driver";
	    url = "jdbc:mysql://localhost:3306/edb12634";
	    user = "root";
	    password = "root";
	    
	    String selectQuery = "select * from employee where id=101";
	    
	    //1. Loading Driver (optional)
	    Class.forName(driver);
	    
	    //2.Establish Connection 
	    Connection con = DriverManager.getConnection(url, user, password);
	    
	    //3. Create Statement object
	    Statement st = con.createStatement();
	    
	    //4. Process Query (SELECT)
	    ResultSet rs = st.executeQuery(selectQuery);
	    
	    if(rs.next()) {
	    	System.out.println(rs.getInt("id"));
	    	System.out.println(rs.getString("name"));
	    	System.out.println(rs.getString("email"));
	    	System.out.println(rs.getLong("mobile"));
	    	System.out.println(rs.getDouble("salary"));
	    	System.out.println("--------------------");
	    }
	    else {
	    	System.out.println("no employee found");
	    }
	    
	    //5. Close resources
	    rs.close();
	    st.close();
	    con.close();
	   
	    
	}
	
}
