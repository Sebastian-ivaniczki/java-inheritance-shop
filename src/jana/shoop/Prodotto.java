package jana.shoop;

import java.util.Random;

public class Prodotto {
	private String code;
	private String name;
	private String description;
	private double price;
	private int iva;
	
	public Prodotto(String name, String description, double price, int iva) {
		setName(name);
		setDescription(description);
		setPrice(price);
		setIva(iva);
		code = getCode();
		
	}
	
	// Getter and Setter 
	
	public String getCode() {
		Random rn = new Random();
		
		int randNum = rn.nextInt(1001);
		
		code = ""+ randNum;
		
		if(code.length() < 8) {
			StringBuilder sb = new StringBuilder(code);
			while(sb.length() < 8 ) {
				sb.insert(0, "0");
			}
			this.code= sb.toString();
		}
		return code;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getIva() {
		return iva;
	}
	
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	public double getIvaPrice() {
		double fulPrice = price + (price * iva / 100);
		return fulPrice;
	}
	
	public String getText() {
		return "Codice prodotto: " + code + " nome prodotto: " + name + 
				"/ndescrizione prodotto: " + description + " " +
				"/nprezzo prodotto " + price + "prezzo con iva: " + getIvaPrice();
	}
	
@Override
public String toString() {
	return getText();
}
	
}
