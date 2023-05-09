package jana.shoop;

import java.util.Random;

public class Smarphone extends Prodotto{
	private String imeiCode;
	private int memoDimension;
	
	public Smarphone(String name, String description, double price, int iva, int memoDimension) {
		
		super(name,description,price,iva);
		setMemoDimension(memoDimension); 
		imeiCode = getImeiCode();
	}

	public String getImeiCode() {
Random rn = new Random();
		
		int randNum = rn.nextInt(101);
		
		imeiCode = ""+ randNum;
		
		if(imeiCode.length() < 8) {
			StringBuilder sb = new StringBuilder(imeiCode);
			while(sb.length() < 8 ) {
				sb.insert(0, "0");
			}
			this.imeiCode= sb.toString();
		}
		return imeiCode;
	}


	public int getMemoDimension() {
		return memoDimension;
	}

	public void setMemoDimension(int memoDimension) {
		this.memoDimension = memoDimension;
	}
	
	@Override
	public String toString() {
		//
		return super.getText() + 
				"/ncodice IMEI " + imeiCode + " " +  "Memoria telefono: " + memoDimension+"GB";
	}
	
	

}
