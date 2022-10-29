package mainZArmy;

import moteurZArmy.Chirurgien;
import moteurZArmy.Civil;
import moteurZArmy.Guerrier;
import moteurZArmy.Medecin;
import moteurZArmy.Personnage;
import moteurZArmy.Sniper;

public class Main {

	public static void main(String[] args) {
		Personnage[] tpers = { new Guerrier(), new Chirurgien(), new Civil(), new Sniper(), new Medecin() };

		for (Personnage p : tpers) {
			System.out.println("\n" + p.getClass().getName());
			System.out.println("******************************************************************************");
			p.combattre();
			p.seDeplacer();
			p.guerir();
		}

	}

}
