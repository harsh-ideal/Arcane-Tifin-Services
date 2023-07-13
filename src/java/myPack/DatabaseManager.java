

package myPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseManager {
    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    public DatabaseManager(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception e){
            
        }
    }
    public Connection getCon(){
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tifindb","root","");
                    }
        catch(Exception ex){
            
        }
                    
            return con;
    }
    public boolean MyInsertUpdateDelete(String command){
        try{
            ps=getCon().prepareStatement(command);
            ps.executeUpdate();
            return true;
        }
        catch(Exception ex){
            return false;
        }
    }
    public ResultSet DisplayAllRecords(String command)
    {
        try
        {
            ps=getCon().prepareStatement(command);
            rs=ps.executeQuery();
            return rs;
        }
        catch(Exception ex)
        {
        return rs;
        }
    }
    
}
