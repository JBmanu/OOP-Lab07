package it.unibo.oop.lab.enum2;

public enum Place {
	INDOOR(""),
	OUTDOOR("");
	
	private String place;
	
	private Place(final String place){
		this.place = place;
	}
	
	public String getPlace() {
		return this.place;
	}
}
