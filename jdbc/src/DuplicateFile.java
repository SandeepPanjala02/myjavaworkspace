import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DuplicateFile {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String driver, url, user, password;
		
		driver = "com.mysql.cj.jdbc.Driver";
	    url = "jdbc:mysql://localhost:3306/db12634";
	    user = "root";
	    password = "root";
	    
	    String procedure = "{call getAllEmployee()}";
	    

	    Class.forName(driver);
	    
	   
	    Connection con = DriverManager.getConnection(url, user, password);
	    //3. Create Statement object
	    CallableStatement st =   con.prepareCall(procedure);
	    
	    //4. Process Query (SELECT)
	    ResultSet rs = st.executeQuery();
	    
	    while(rs.next()) {
	    	System.out.println(rs.getInt("id"));
	    	System.out.println(rs.getString("name"));
	    	System.out.println(rs.getDouble("salary"));
	    	System.out.println(rs.getString("Gender"));
	    	System.out.println(rs.getString("city"));
	    	System.out.println("--------------------");
	    }
	    
	    //5. Close resources
	    rs.close();
	    st.close();
	    con.close();
	   
	    
	}
	
}
