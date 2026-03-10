package bibliotheque;

public class Ouvrage {

	// constantes
	private static int NB_MAX_EXEMPLAIRES = 50;

	private String titre;
	private String auteurs;
	private String editeur;
	private int annee;
	private String isbn;

	// à savoir refaire
	private Exemplaire[] exemplaires = new Exemplaire[NB_MAX_EXEMPLAIRES]; // déclaration + instanciation
	private int nbExemplaires = 0;
}
