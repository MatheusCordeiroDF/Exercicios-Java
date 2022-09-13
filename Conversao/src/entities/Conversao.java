package entities;

public class Conversao {
	private double c;

	
	
	
	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double tempk() {
		
		return 273.15 + c;
	}
	
	public double tempf() {
		
		return c * 1.8 + 32;
	}
	
	
	
}
