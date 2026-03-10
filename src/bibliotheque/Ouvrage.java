package bibliotheque;

import java.util.Arrays;

public class Ouvrage {

	// constantes
	private static int NB_MAX_EXEMPLAIRES = 3;

	private String titre;
	private String auteurs;
	private String editeur;
	private int annee;
	private String isbn;
	private Genre genre;

	// à savoir refaire
	private Exemplaire[] exemplaires = new Exemplaire[NB_MAX_EXEMPLAIRES]; // déclaration + instanciation
	private int nbExemplaires = 0;

	public Ouvrage(String titre, String auteurs, String editeur, int annee, String isbn, Genre genre) {
		this.titre = titre;
		this.auteurs = auteurs;
		this.editeur = editeur;
		this.annee = annee;
		this.isbn = isbn;
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Ouvrage [titre=" + titre + ", genre=" + genre + ", exemplaires=" + Arrays.toString(exemplaires) + "]";
	}

	private boolean ajouteExemplaire(Exemplaire ex) {
		if (nbExemplaires < NB_MAX_EXEMPLAIRES) {
			exemplaires[nbExemplaires] = ex;
			nbExemplaires++;
			return true;
		}
		System.out.println("OMG");
		return false;
	}

	public void ajouteExemplaire() {
		Exemplaire ex = new Exemplaire("COTE_" + nbExemplaires);
		ajouteExemplaire(ex);

	}

}
