package Main;

import Model.Airport;
import View.View;
import db.* ;

public class Main {

	public static void main(String[] args) {
//		View view = new View();


		AirportCatalog airportCatalog = AirportCatalog.getInstance() ;

		airportCatalog.getCatalog();	}

}
