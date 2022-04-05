package domain;

import java.util.Date;

public class Weather {

	private Location location;
	private Current current;

	
	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}


	public Current getCurrent() {
		return current;
	}
	

	public void setCurrent(Current current) {
		this.current = current;
	}

	@Override
	public String toString() {
		return "Pozicioniranje {" + location + "}"+"Prognnoza: " + current ;
	}
	
}
