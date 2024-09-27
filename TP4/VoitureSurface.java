class VoitureSurface implements IVoiture{
	private final Couleur couleur ;
	private final Moteur moteur;
	private final Reservoir reservoir ;
	private Personne personne = null ;
	
	public VoitureSurface(Couleur couleur, Moteur moteur, Reservoir reservoir){
		this.couleur=couleur;
		this.moteur=moteur;
		this.reservoir=reservoir;
	}
	public VoitureSurface(VoitureSurface ref){
		this.couleur=ref.couleur;
		this.moteur=ref.moteur;
		this.reservoir=ref.reservoir;
	}
	
	public Couleur getCouleur(){
		return couleur;
	}	
	public Moteur getMoteur(){
		return moteur;
	}

	public Rerservoir getReservoir(){
		return reservoir;
	}
	public Personne getPersonne(){
		return personne;
	} 
	
	public void setPersonne(Personne personne){
		this.personne=personne;
	}
	public void setConducteur(Personne personne){
		if(personne.age() <18){
			this.personne = null;
			System.out.println
		}
		else{
			this.personne =personne;
		}
	}
	
	public String toString(){
		return "La voiture est de couleur " + couleur + ",moteur"+ moteur.toString() + ",reservoir:" + reservoir.toString()+ ",personne:" + personne.toString(); 
	}
	public void afficher(){
		System.out.println(this.toString());
	}
	
	public double avancer(double distance){
		double parcouru =0;
		if(personne = null){
			System.out.println("La voiture n'avance pas");
		}
		else{
			if(moteur.getConsomation()/100)*distance>reservoir.getContenu()){
					parcouru=(resevoir.getConsomation()*100)/resevoir.getReservoir;
					reservoir.vider(reservoir.getContenu());
			}
			else{
				reservoir.vider((moteur.getConsomation()/100)*distance);
				parcouru=distance;
			}
		}
		return parcouru;
	}
    public double faireLePlein(){
    	Reservoir.FaireLePlein();
    	return reservoir.getContenu();
    }

    /**
     * Retourne le contenu du r&eacute;servoir de la voiture
     * @return le contenu du r&eacute;servoir
     */
    public double getContenuReservoir(){
    	return reservoir.getContenu();
    }

}
	
