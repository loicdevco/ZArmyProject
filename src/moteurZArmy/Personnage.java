package moteurZArmy;

public abstract class Personnage {

	protected String arme = "", chaussure = "", sacDeSoin = "";

	// M�thode de d�placement des personnages
	public void seDeplacer() {
		System.out.println("Je me deplace � pied");
	}

	// M�thode qu'utilisent les combattants
	public void combattre() {
		System.out.println("Je ne combat pas!");
	}

	public void guerir() {
		System.out.println("je ne soigne pas !");
	}

	public void arme(String arme) {
		this.arme = arme;
	}

	public void chaussure(String chaussure) {
		this.chaussure = chaussure;
	}

	public void sacDeSoin(String SacDeSoin) {
		this.sacDeSoin = sacDeSoin;
	}
}
