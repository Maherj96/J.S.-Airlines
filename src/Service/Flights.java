package Service;
import java.util.*;
public class Flights {
private int idFlight;
private String  departureLocation;
private String arrivalLocation;
private Date departureDate;
private Date arrivalDate;

public Flights(int id, String DL, String AL, Date DD, Date AD){
	this.idFlight=id;
	this.departureLocation=DL;
	this.arrivalLocation=AL;
	this.departureDate=DD;
	this.arrivalDate=AD;
}
public int getID(){
	return idFlight;
}
public String getDepartLoc() {
	return departureLocation;
}
public Date getDD() {
	return departureDate;
}
public Date getAD(){
	return arrivalDate;
}

}
