package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Flight {
	public enum Status {
		PLANNED,
		WAITING
	}
	private Airport origin;
	private Airport destination;
	private String flightName;
	private Date departureTime ;
	private Date arrivalTime;
	private Status status;
	private Employee pilot = null;
	private Employee copilot = null;
	private List<Employee> stewards ;

	/**
	 * @param origin
	 * @param destination
	 * @param flightName
	 * @param departureTime
	 * @param arrivalTime
	 */
	public Flight(Airport origin, Airport destination, String flightName, Date departureTime, Date arrivalTime) {
		super();
		this.origin = origin;
		this.destination = destination;
		this.flightName = flightName;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;

		this.stewards = new ArrayList<Employee> () ;
		this.status = Status.WAITING ;

	}
	public Airport getOrigin() {
		return origin;
	}
	public void setOrigin(Airport origin) {
		this.origin = origin;
	}
	public Airport getDestination() {
		return destination;
	}
	public void setDestination(Airport destination) {
		this.destination = destination;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public Employee getPilot() {
		return pilot;
	}
	public void setPilot(Employee e) {
		if (e.getRole() == Employee.Role.PILOT) {
			this.pilot = e;
			checkStatus();
		}

	}
	public Employee getCopilot() {
		return copilot;
	}
	public void setCopilot(Employee e) {
		if (e.getRole() == Employee.Role.COPILOT) {
			this.copilot = e;
			checkStatus();
		}
	}
	public List<Employee> getStewards() {
		return stewards;
	}
	public void addStewards(Employee e) {
		if (e.getRole() == Employee.Role.STEWARD) {
			this.stewards.add(e);
			checkStatus();
		}
	}

	private void checkStatus() {
		if (getPilot() != null && getCopilot() != null && getStewards().size() == 3) {
			this.status = Status.PLANNED ;
		} else {
			this.status = Status.WAITING ;
		}

	}

}
