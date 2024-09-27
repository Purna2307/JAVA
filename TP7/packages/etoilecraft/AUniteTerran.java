package etoilecraft;

public abstract class AUniteTerran implements IUnite{
	private double PointsDeVie;
	private double PointsArmure;
	private double PuissanceTirSol;
	private double PuissanceTirAir;
	
	public AUniteTerran(double PointsDeVie,double PointsArmure, double PuissanceTirSol, double PuissanceTirAir){
		this.PointsDeVie=PointsDeVie;
		this.PointsArmure=PointsArmure;
		this.PuissanceTirAir=PuissanceTirAir;
		this.PuissanceTirSol=PuissanceTirSol;
	}
	
	public double getPointsDeVie() {
		return this.PointsDeVie;
	}
	
	public double getPointsArmure() {
		return this.PointsArmure;
	}

    public double getPuissanceTirSol(){
    	return this.PuissanceTirSol;
    }
    
    public double getPuissanceTirAir(){
		return this.PuissanceTirAir;
	}
    
    public boolean subirAttaque(double degats){
    	boolean reponse = false;
		if(PointsArmure!=0){
			degats=degats/PointsArmure;
			PointsDeVie-=degats;
			if(PointsDeVie<=0){
				reponse=true;
			}
		}
		else{
			PointsDeVie-=degats;
			if(PointsDeVie<=0){
				reponse=true;
			}
		}
		return reponse;
	}
    /**
     * Indique si l'unite est volante ou non
     * @return vrai si l'unite est volante
     */
    public abstract boolean estVolante();

    public boolean attaquer(IUnite u){
    	boolean reponse = false;
    	if(u.estVolante()==true){
    		if((u.getPointsDeVie()-(Math.random()*PuissanceTirAir))<=0){reponse=true;}
    	}
    	else{
    		if((u.getPointsDeVie()-(Math.random()*PuissanceTirAir))<=0){reponse=true;}
    	}
    	return reponse;
    	
    }
}



