package CucumberJoueur.TP3;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
	private String nom;
	private int fondation;
	private List<Joueur> listeJoueurs;

	public Equipe() {
		this.nom = " ";
		this.fondation = 0000;
		this.listeJoueurs = new ArrayList<>();
	}

	public Equipe(String nom, int fondation, List<Joueur> listeJoueurs) {
		this.nom = nom;
		this.fondation = fondation;
		this.listeJoueurs = listeJoueurs;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Equipe) {
			Equipe e = (Equipe) o;
			return (e.getNom() == this.nom && e.getFondation() == this.fondation
					&& e.getListeJoueurs().equals(this.listeJoueurs));
		} else
			return false;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getFondation() {
		return fondation;
	}

	public void setFondation(int fondation) {
		this.fondation = fondation;
	}

	public List<Joueur> getListeJoueurs() {
		return listeJoueurs;
	}

	public void setListeJoueurs(List<Joueur> listeJoueurs) {
		this.listeJoueurs = listeJoueurs;
	}

	public void ajouterJoueur(Joueur newJoueur) {
		newJoueur.getEquipe().getListeJoueurs().remove(newJoueur);
		this.listeJoueurs.add(newJoueur);
		newJoueur.setEquipe(this);
	}

	public void supprimerJoueur(Joueur joueur) {
		this.listeJoueurs.remove(joueur);
//		joueur.setEquipe(null);
	}
}