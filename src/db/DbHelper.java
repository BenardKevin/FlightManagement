package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
	String url= "jdbc:mysql://192.168.0.115:3306/flight_management";
	String user ="root";
	String driver= "com.mysql.jdbc.Driver" ;
	String password = "";
	
	Connection connection ;

	private DbHelper()	{	
		
		try{
			Class.forName(driver);
			connection = getConnection() ;
		}catch(ClassNotFoundException e){

		}
	}

	private static DbHelper INSTANCE = new DbHelper();

	public static DbHelper getInstance()
	{   
		return INSTANCE;
	}


    public Connection getConnection(){
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
