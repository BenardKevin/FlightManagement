package db;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Airport;

public class AirportCatalog {
	private List<Airport> catalog ;

	private AirportCatalog()
	{
		catalog = new ArrayList<Airport>() ;
	}

	/** Instance unique pré-initialisée */
	private static AirportCatalog INSTANCE = new AirportCatalog();

	/** Point d'accès pour l'instance unique du singleton */
	public static AirportCatalog getInstance()
	{   return INSTANCE;
	}

	public List<Airport> getCatalog() {
		read();
		return catalog;
	}

	public void setCatalog(List<Airport> catalog) {
		this.catalog = catalog;
	}

	public void read () {
		CallableStatement statement = null;
		try {
			statement = DbHelper.getInstance().getConnection().prepareCall("SELECT * FROM airport;");
			statement.execute();
			ResultSet set = statement.getResultSet();
			while (set.next()) {
				String name = set.getString("name") ;
				String iataCode = set.getString("iata_code") ;
				String city = set.getString("city") ;
				String country = set.getString("country") ;

				Airport airport = new Airport (name, iataCode, city, country) ;
				catalog.add(airport);
			}

		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}