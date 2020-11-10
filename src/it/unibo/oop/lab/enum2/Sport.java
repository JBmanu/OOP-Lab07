/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {
	BASKET("Basket", 5, Place.INDOOR),
	SOCCER("Soccer", 11, Place.INDOOR),
	TENNIS("Tennis", 1, Place.OUTDOOR),
	BIKE("Bike", 1, Place.OUTDOOR),
	F1("F1", 1, Place.OUTDOOR),
	MOTOGP("MotoGP", 1, Place.OUTDOOR),
	VOLLEY("Volley", 6, Place.INDOOR);
	
	private String sport;
	private Integer nTeamMembers;
	private Place place;
	
	private Sport(final String sport, final Integer nTeamMembers, final Place place) {
		this.sport = sport;
		this.nTeamMembers = nTeamMembers;
		this.place = place;
	}
	
	public String getSport() {
		return sport;
	}

	public Integer getnTeamMembers() {
		return nTeamMembers;
	}

	public Place getPlace() {
		return this.place;
	}
	
	public boolean isIndividualSport() {
		return this.getnTeamMembers() == 1;
	}

	public boolean isIndoorSport() {
		return this.getPlace() == Place.INDOOR;
	}


    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */

    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */

    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
}
