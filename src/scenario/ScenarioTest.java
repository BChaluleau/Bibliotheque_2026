package scenario;

import bibliotheque.Bibliotheque;
import bibliotheque.Genre;
import bibliotheque.Ouvrage;

public class ScenarioTest {

	public static void main(String[] args) {

		Bibliotheque bu = new Bibliotheque(5);

		Ouvrage o = bu.nouvelOuvrage("T1", "auteur", "editeur", 2026, "111", Genre.ROMAN); // vision domaine
		// Ouvrage o = new Ouvrage(); // vision données
		Ouvrage o2 = bu.nouvelOuvrage("T2", "auteur", "editeur", 2026, "222", Genre.POLICIER);

		// Exemplaire e1 = new Exemplaire("Cote_1");
		o.ajouteExemplaire();
		o.ajouteExemplaire();
		o.ajouteExemplaire();
		o.ajouteExemplaire();
		o.ajouteExemplaire();

		o2.ajouteExemplaire();

		System.out.println(bu);

		System.out.println("Fin");
	}

}
