package CucumberJoueur.TP3;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class Stepdefs {
	private Joueur umtiti;
	private Equipe france;
	private Equipe cameroun;
	
	@Given("^la création de Umtiti qui appartient de cameroun$")
	public void la_création_de_Umtiti_qui_appartient_de_cameroun(){
		cameroun = new Equipe("Equipe de Cameroun",1955,new ArrayList<>());
		umtiti = new Joueur(7,"Umtiti",cameroun);
	}

	@When("^le manager valide le transfert du Umtiti de cameroun à france$")
	public void le_manager_valide_le_transfert_du_Umtiti_de_cameroun_à_france(){
		france = new Equipe("Equipe de France",1904,new ArrayList<Joueur>());
		umtiti.transferJoueur(france);
	}

	@Then("^l'équipe de joueur après le transfert sera france$")
	public void l_équipe_de_joueur_après_le_transfert_sera_france(){
		assertEquals(france, umtiti.getEquipe());
	}

}