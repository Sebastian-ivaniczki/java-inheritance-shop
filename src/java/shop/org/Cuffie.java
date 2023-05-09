package java.shop.org;

public class Cuffie extends Prodotto{
	private String color;
	private boolean isWirles; 
	public Cuffie(String name, String description, double price, int iva, String color, boolean isWirles) {
		
		super(name,description,price,iva);
		
		setColor(color);
		setWirles(isWirles);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isWirles() {
		return isWirles;
	}
	public void setWirles(boolean isWirles) {
		this.isWirles = isWirles;
	}
	
	@Override
	public String toString() {
		//
		return super.getText() + 
				"/ncolore cuffie: " + color + "wirles: " + isWirles;
	}

}
