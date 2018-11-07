package CucumberJoueur.TP3;

public class Joueur {
	private int numero;
	private String nom;
	private Equipe equipe;

	public Joueur() {
		this.numero = 0;
		this.nom = " ";
		this.equipe = null;
	}

	public Joueur(int numero, String nom, Equipe equipe) {
		this.numero = numero;
		this.nom = nom;
		this.equipe = equipe;
		this.equipe.getListeJoueurs().add(this);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
		if (!(this.equipe.getListeJoueurs().contains(this)))
			this.equipe.getListeJoueurs().add(this);
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Joueur) {
			Joueur j = (Joueur) o;
			return (j.getNom() == this.nom && j.getNumero() == this.numero && j.getEquipe() == this.equipe);
		} else
			return false;
	}

	public void transferJoueur(Equipe nouvelleEquipe) {
		this.equipe.supprimerJoueur(this);
		nouvelleEquipe.ajouterJoueur(this);
		this.equipe = nouvelleEquipe;
	}

	public Boolean tirerBut(double longeur, double hauteur) {
		if ((longeur > 41.34) && (longeur < 48.66) && (hauteur < 2.44) && (hauteur >= 0))
			return true;
		return false;
	}
}