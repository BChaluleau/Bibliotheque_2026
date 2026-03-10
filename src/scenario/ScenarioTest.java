package scenario;

import bibliotheque.Bibliotheque;
import bibliotheque.Exemplaire;
import bibliotheque.Ouvrage;

public class ScenarioTest {

	public static void main(String[] args) {

		Bibliotheque bu = new Bibliotheque(5);

		Ouvrage ouvrage = new Ouvrage("titre", "auteur", "editeur", 2026, "ISBN_XXX");

		Exemplaire e1 = new Exemplaire("Cote_1");
		Exemplaire e2 = new Exemplaire("Cote_2", false);
		Exemplaire e3 = new Exemplaire("Cote_3", true);
		ouvrage.ajouteExemplaire(e1);
		ouvrage.ajouteExemplaire(e2);
		ouvrage.ajouteExemplaire(e3);

		bu.ajoute(ouvrage);

		System.out.println(bu);

		System.out.println("Fin");
	}

}
