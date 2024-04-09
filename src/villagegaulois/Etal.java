package villagegaulois;

import personnages.Gaulois;
import villagegaulois.*;

public class Etal <P> {
	private Gaulois vendeur;
	private P[] produits;
	private int nbProduit;
	private int prix;

	public Etal (Gaulois vendeur, P[] produits, int nbProduit, int prix) {
		this.vendeur = vendeur;
		this.produits = produits;
		this.nbProduit = nbProduit;
		this.prix = prix;
	}
	
	public void installerVendeur(Gaulois vendeur, P[] produit, int prix) {
		nbProduit = produit.length;
		this.vendeur = vendeur;
		this.prix = prix;
		produits = produit;		//conusion possible car seul le -s fait la différence
	}
	
	
	@Override
	public int contientProduit(String produit, int quantiteSouhaitee) {
		int quantiteAVendre = 0;
		if (nbProduit != 0 && this.produits[0].getNom().equals(produit)) {
		if (nbProduit >= quantiteSouhaitee) {
		quantiteAVendre = quantiteSouhaitee;
		} else {
		quantiteAVendre = nbProduit;
		}
		}
		return quantiteAVendre;
	}
	
	
	@Override
	public double acheterProduit(int quantiteSouhaite) {
		double prixPaye = 0;
		for (int i = nbProduit - 1; i > nbProduit - quantiteSouhaite - 1 || i > 1; i--) {
			prixPaye += produits[i].calculerPrix(prix);
		}
		if (nbProduit >= quantiteSouhaite) {
			nbProduit -= quantiteSouhaite;
		} else {
			nbProduit = 0;
		}
		return prixPaye;
	}
	
	
	@Override
	public String etatEtal() {
		StringBuilder chaine = new StringBuilder(vendeur.getNom());
		if (nbProduit > 0) {
			chaine.append(" vend ");
			chaine.append(nbProduit + " produits :");
			for (int i = 0; i < nbProduit; i++) {
				chaine.append("\n- " + produits[i].description());
			}
		} else {
			chaine.append(" n'a plus rien à vendre.");
		}
		chaine.append("\n");
		return chaine.toString();
	}
	
	
	
	
	
}
