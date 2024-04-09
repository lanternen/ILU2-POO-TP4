package scenarioTest;

import produit.*;
//import villagegauloisold.*;
import villagegaulois.*;
import personnages.*;

public class ScenarioTest {
	public static void main(String[] args) {
		
//		IEtal<Sanglier>[] marche = new IEtal[3];
//		IEtal<Sanglier> etalSanglier = new Etal<>();
//		IEtal<Poisson> etalPoisson = new Etal<>();
//		marche[0] = etalSanglier;
//		marche[1] = etalPoisson;
//		
//		IEtal[] etals = new IEtal[3];
//		Etal<Sanglier> etalSanglier = new Etal<>();
//		etals[0] = etalSanglier;
//		etals[0].occuperEtal(new Gaulois("Ordralfab�tix", 12), new Poisson("lundi"), 10);
		
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);
		
		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);
		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = {poisson1};
		
		Etal etalObelix = new Etal(obelix, sangliersObelix, sangliersObelix.length, 8);
		etalObelix.installerVendeur(obelix, sangliersObelix, 8);
		
		Etal etalAsterix = new Etal(asterix, sangliersAsterix, sangliersAsterix.length, 10);
		etalAsterix.installerVendeur(asterix, sangliersAsterix, 10);
		
		Etal etalOrdralfabetix = new Etal (ordralfabetix, poissons, poissons.length, 7);
		etalOrdralfabetix.installerVendeur(ordralfabetix, poissons, 7);
		
		//système D/20
		
	}
	
}
