package bibliotheque;

public class Bibliotheque {

	private int nbMaxOuvrages; // int, type primitif, initialisé à 0

	private Ouvrage[] fond; // instanciation doit attendre qu'on connaisse nbMaxOuvrages
	private int nbOuvrages = 0;

	public Bibliotheque(int nbMaxOuvrages) {
		this.nbMaxOuvrages = nbMaxOuvrages; // shadowing
		fond = new Ouvrage[nbMaxOuvrages]; // VLA
	}

}
