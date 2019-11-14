package application;

/**
 * Berechnet das Formelrad
 * @author Peter Rutschmann
 * @version 13.09.2018
 */
public class Calculator {
	private double leistung;
	private double spannung;
	private double strom;
	private double widerstand;
	
	public Calculator(double leistung, double spannung, double strom, double widerstand) {
		super();
		this.leistung = leistung; //watt
		this.spannung = spannung; //volt
		this.strom = strom; //ampere
		this.widerstand = widerstand; //ohm
	}
	
	public double getLeistung() {
		return leistung;
	}
	
	public double getSpannung() {
		return spannung;
	}

	public double getStrom() {
		return strom;
	}

	public double getWiderstand() {
		return widerstand;
	}

	@Override
	public String toString() {
		return "Calculator [leistung=" + leistung + 
				", spannung=" + spannung + 
				", strom=" + strom + 
				", widerstand="	+ widerstand + "]";
	}

	public void calculate() {
		/* Hier auf Grund der vorhanden Werte entscheiden
		 * welche Methode unten aufgerufen werden muss.
		 */
		
		if(getStrom() == 0 && getLeistung() != 0 && getWiderstand() != 0 ){
			
			StromausLeistungundWiderstand();
		}
		
		if(getStrom() == 0 && getLeistung() != 0 && getWiderstand() != 0 ){
			
			StromausLeistungundWiderstand();
		}
		
		
	}
	
	public double StromausLeistungundWiderstand(){
		
		double zwischenres = getLeistung() / getSpannung();
		double res = Math.sqrt(zwischenres);
		
		return res;		
	}
	
	public double StromausLeistungundSpannung(){
		
		double res = getLeistung() / getSpannung();
		
		return res;		
	}
	
}
