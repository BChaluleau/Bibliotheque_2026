package bibliotheque;

public enum Genre {
	ROMAN("El romano"), SF("El science fictionné"), POLICIER("El policiar"), AUTRE("Autre.");

	private String nomAffichable;

	private Genre(String nomAffichable) {
		this.nomAffichable = nomAffichable;
	}

	@Override
	public String toString() {
		return nomAffichable;
	}

}
