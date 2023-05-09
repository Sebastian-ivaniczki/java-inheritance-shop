package jana.shoop;

public class Televisori extends Prodotto {
	private int dimension;
	private boolean isSmart;
	public Televisori(String name, String description, double price, int iva, int dimension, boolean isSmart) {
		
		super(name,description,price,iva);
		
		setDimension(dimension);
		setSmart(isSmart);
	}
	public int getDimension() {
		return dimension;
	}
	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	public boolean isSmart() {
		return isSmart;
	}
	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}
	@Override
	public String toString() {
		//
		return super.getText() + 
				"/ndemensioni Tv: " + dimension + " " + "Smart: " + isSmart;
	}
}
