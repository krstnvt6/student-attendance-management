
package attendancesystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnection {
    
    public static Connection getConnection(){
        
        Connection con = null;
   try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/students","root","");
    }catch (Exception e){
        System.out.print(e);
    }
   return con;
    }
}
