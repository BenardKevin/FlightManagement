package Model;

public class Airport {
 private String name;
 private String IATA_code;
 private String city;
 private String country;
 
/**
 * @param name
 * @param iATA_code
 * @param city
 * @param country
 */
public Airport(String name, String iATA_code, String city, String country) {
	super();
	this.name = name;
	IATA_code = iATA_code;
	this.city = city;
	this.country = country;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getIATA_code() {
	return IATA_code;
}
public void setIATA_code(String iATA_code) {
	IATA_code = iATA_code;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
 
 
}
