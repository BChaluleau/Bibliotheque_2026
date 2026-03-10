package bibliotheque;

import java.util.Arrays;

public class Bibliotheque {

	private int nbMaxOuvrages; // int, type primitif, initialisé à 0

	private Ouvrage[] fond; // instanciation doit attendre qu'on connaisse nbMaxOuvrages
	private int nbOuvrages = 0;

	public Bibliotheque(int nbMaxOuvrages) {
		this.nbMaxOuvrages = nbMaxOuvrages; // shadowing
		fond = new Ouvrage[nbMaxOuvrages]; // VLA
	}

	@Override
	public String toString() {
		return "Bibliotheque [fond=" + Arrays.toString(fond) + ", nbOuvrages=" + nbOuvrages + "]";
	}

	private void ajoute(Ouvrage ouvrage) {
		if (nbOuvrages < nbMaxOuvrages) {
			fond[nbOuvrages] = ouvrage;
			nbOuvrages++;
		} else {
			System.out.println("La bibliothèque est pleine");
		}
	}

	public Ouvrage nouvelOuvrage(String titre, String auteurs, String editeur, int annee, String isbn, Genre genre) {
		Ouvrage ouvrage = new Ouvrage(titre, auteurs, editeur, annee, isbn, genre);
		ajoute(ouvrage);
		return ouvrage;
	}

}
