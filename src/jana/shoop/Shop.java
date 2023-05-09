package jana.shoop;

public class Shop {
	public static void main(String[] args) {
		Prodotto p1 = new Prodotto("ab", "abc", 12 ,20);
		System.out.println("Prodotto:" + " " +p1.toString());
		
		Smarphone s1 = new Smarphone("sam", "dbaskjfas", 200.12D, 22, 20);
		System.out.println("Smartphone:" + " " + s1.toString());
		
		Televisori t1 = new Televisori("asf", "dsaigsfgaf", 200.12D, 22, 25, false);
		System.out.println("televisori:" + " " +t1.toString());
		
		Cuffie c1 = new Cuffie("asf", "dsaigsfgaf", 200.12D, 22, "blue", true);
		System.out.println("cuffie:" + " " + c1.toString());
	}
}
