/**
 * 
 */
package it.unibo.oop.lab.enum1;

/**
 * Represents an enumeration for declaring sports;
 * 
 * 1) Complete the definition of the enumeration.
 * 
 */
public enum Sport {
	BASKET("Basket"),
	SOCCER("Soccer"),
	TENNIS("Tennis"),
	BIKE("Bike"),
	F1("F1"),
	MOTOGP("MotoGP"),
	VOLLEY("Volley");
	
	private String sport;
	
	private Sport(final String sport) {
		this.sport = sport;
	}
	
	public String getSport() {
		return sport;
	}
    /*
     * declare the following sports: - basket - soccer - tennis - bike - F1 -
     * motogp - volley
     */
}
