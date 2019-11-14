package application;

import java.lang.Math;

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
		
		//Lenny
		if(getStrom() == 0 && getLeistung() != 0 && getWiderstand() != 0 ){
			
			StromausLeistungundWiderstand();
		}
		
		if(getStrom() == 0 && getLeistung() != 0 && getSpannung() != 0 ){
			
			StromausLeistungundSpannung();
		}
		
		if(getStrom() == 0 && getSpannung() != 0 && getWiderstand() != 0 ){
			
			StromausSpannungundWiderstand();
		}
		
		
		
		
		//Ali
		if(getLeistung() == 0 && getSpannung() == 0 && getWiderstand() != 0 && getStrom() != 0) {
			WiderstandMalStromstaerkeHochZwei();
		}
		if(getLeistung() == 0 && getWiderstand() == 0 && getStrom() != 0 && getSpannung() != 0) {
			SpannungMalStromstaerke();
		}
		if(getLeistung() == 0 && getStrom() == 0 && getSpannung() != 0 && getWiderstand() != 0) {
			LeistungDrei();
		}
		if(getLeistung() == 0 && getSpannung() == 0 && getWiderstand() != 0 && getStrom() != 0) {
			WiderstandMalStromstaerke();
		}
		if(getSpannung() == 0 && getWiderstand() == 0 && getLeistung() != 0 && getStrom() != 0) {
			LeistungDurchStromstaerke();
		}
		if(getStrom() == 0 && getSpannung() == 0 && getWiderstand() != 0 && getLeistung() != 0) {
			SpannungDrei();
		}

	}
	
	//Lenny
	public double StromausLeistungundWiderstand(){
		
		double zwischenres = getLeistung() / getWiderstand();
		double res = Math.sqrt(zwischenres);
		
		return res;		
	}
	
	public double StromausLeistungundSpannung(){
		
		double res = getLeistung() / getSpannung();
		
		return res;		
	}
	
	public double StromausSpannungundWiderstand(){
		
		double res = getSpannung() / getWiderstand();
		
		return res;		
	}
	
	
	
	//Ali
	public double WiderstandMalStromstaerkeHochZwei() {
		double zwischenresultat = getStrom() * getStrom();
		double resultat = getWiderstand() * zwischenresultat;
		return resultat;
	}
	
	public double SpannungMalStromstaerke() {
		double resultat = getSpannung() * getStrom();
		return resultat;
	}
	
	public double LeistungDrei() {
		double zwischenresultat = getSpannung() * getSpannung();
		double resultat = zwischenresultat / getWiderstand();
		return resultat;
	}
	
	public double WiderstandMalStromstaerke() {
		double resultat = getWiderstand() * getStrom();
		return resultat;
	}
	
	public double LeistungDurchStromstaerke() {
		double resultat = getLeistung() / getStrom();
		return resultat;
	}
	
	public double SpannungDrei() {
		double zwischenresultat = getLeistung() * getWiderstand();
		double resultat = Math.sqrt(zwischenresultat);
		return resultat;
	}
	
}
