package transport;
/**
 * La classe <b>Moteur</b> qui correspond &agrave; un moteur de v&eacute;hicule.
 * @author Cyril Rabat
 * @author Jessica Jonquet
 * @version 06/02/2023
 */
public class Moteur implements IMoteur {

    // Attribut(s)
    
    private String carburation;
    private double consommation;  

    /**
     * Construit un moteur &agrave; essence qui consomme 6.5L/100km
     */
    public Moteur() {
	carburation = "essence";
	consommation = 6.5;
    }

    /**
     * Constructeur par initialisation
     * @param carburation la carburation du moteur
     * @param consommation la consommation du moteur
     */
    public Moteur(String carburation, double consommation) {		  
	this.carburation = carburation;
	this.consommation = consommation;
    }

    /**
     * Constructeur par copie
     * @param m le moteur &agrave; recopier
     */
    public Moteur(Moteur m) {
	carburation = m.carburation;
	consommation = m.consommation;
    }

    /**
     * Retourne la carburation du moteur
     * @return la carburation
     */
    public String getCarburation() {
	return carburation;
    }

    /**
     * Retourne la consommation du moteur
     * @return la consommation
     */
    public double getConsommation() {
	return consommation;
    }

    /**
     * Affiche le moteur &agrave; l'&eacute;cran
     */
    public void afficher() {
	System.out.println(toString());
    }

    /**
     * Retourne un moteur sous forme de chaine de caract&egrave;res
     * @return une chaine de caract&egrave;res
     */
    public String toString() {
	return carburation + " (" + consommation + "L/100km)";
    }

}
