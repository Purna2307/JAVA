package transport;

import personne.*;
import java.util.Scanner;
/**
class VoitureSurface {
	private  Couleur couleur;
	private  Moteur moteur;
	private  Reservoir reservoir;
	private Personne personne;
	
	public VoitureSurface(Couleur couleur, Moteur moteur, Reservoir reservoir){
		this.couleur = couleur;
		this.moteur = moteur;
		this.reservoir = reservoir;
	}
	
	public VoitureSurface(VoitureSurface voiture){
		this.couleur = voiture.couleur;
		this.moteur = voiture.moteur;
		this.reservoir = voiture.reservoir;
	}
	
	public Couleur getCouleur(){
		return couleur;
	}
	
	public Moteur getMoteur(){
		return moteur;
	}
	
	public Reservoir getReservoir(){
		return reservoir;
	}
	
	public Personne personne(){
		return personne;
	}
	
	public void setConducteur(Personne personne){
		if (personne.getAge < 18){
			System.out.println("Le nouveau conducteur que vous essayez d'ajouter est mineur, modification impossible");
		}
		else {
			this.personne = personne;
		}
	}
	
	public String toString(){
		return "Couleur : "+couleur+" Moteur : "+moteur.toString()+" Reservoir : "+reservoir.toString()+" Conducteur : "+personne.toString();
	}
	
	public void afficher(){
		System.out.println(this.toString());
	}
	
	/**
	* Fait avancer la voiture de la distance sp&eacute;cifi&eacute;e en
	* param&egrave;tre et retourne le nombre de kilom&egrave;tres qui ont
	* &eacute;t&eacute; effectivement parcourus
	* @param distance la distance &agrave; parcourir
	* @return le nombre de kilom&egrave;tres parcourus
	
	public double avancer(double distance){
		double parcouru;
		if(personne = null){
			System.out.println("Aucun conducteur la voiture ne peut pas démarrer");
			parcouru = 0;
		}
		else{
			double conso = (moteur.getConsomation()/100)*distance;
			if (conso > reservoir){
				parcouru = (reservoir/moteur.getConsomation)*100;
				reservoir = 0;
			}
			else{
				reservoir -= conso;
				parcouru = distance;
			}
		}
		return parcouru;
	}

	/**
	* Fait le plein du r&eacute;servoir de la voiture
	* @return la quantit&eacute; ajout&eacute;e dans le r&eacute;servoir
	
	public double faireLePlein(){
		reservoir = reservoir.capacite();
		return reservoir;
	}

	/**
	* Retourne le contenu du r&eacute;servoir de la voiture
	* @return le contenu du r&eacute;servoir
	
	public double getContenuReservoir(){
		return reservoir.getContenu();
	}
}*/
