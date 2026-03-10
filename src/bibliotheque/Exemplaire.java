package bibliotheque;

public class Exemplaire {

	private String cote;
	private boolean empruntable;

	public Exemplaire(String cote) {
		this(cote, true); // appel au second constructeur
	}

	public Exemplaire(String cote, boolean empruntable) {
		this.cote = cote;
		this.empruntable = empruntable;
	}

}
