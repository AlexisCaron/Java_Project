package testbbd;
import java.sql.*;

import com.mysql.jdbc.*;

public class Demobdd {
	public static void main(String[] args){
		readinbase();
	}

	public static void readinbase(){
		String url = "jdbc:mysql://localhost:3307/boulderdash";
		String login = "root";
		String passwd = "Myzyk195";
		java.sql.Connection cn = null;
		java.sql.ResultSet re = null;
		java.sql.Statement st = null;
		try{
		 Class.forName ("com.mysql.jdbc.Driver");
         cn = DriverManager.getConnection(url, login, passwd);
         st = cn.createStatement ();
         String sql = "{call boulderdash.Level2()}";
         re = st.executeQuery(sql);
        
         while (re.next()) {
                         System.out.println(re.getString("MapPattern"));
         }
} catch (SQLException e) {
         e.printStackTrace();
} catch (ClassNotFoundException e){
         e.printStackTrace();
} finally {
         try {
                         cn.close();
                         st.close();
         } catch (SQLException e){
                         e.printStackTrace();
         }
}
}
	
}
