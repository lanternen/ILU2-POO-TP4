package produit;

public class Poisson extends Produit {

	private String date;
	
	public Poisson(String date) {
		super("poisson", "kg");
		this.date = date;
	}
	
	public void decrireProduit(Produit produit) {
		System.out.println(getNom() + " pêché " + date);
	}

}
