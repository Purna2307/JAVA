package etoilecraft;

public class Flammeur extends AUniteTerran{

	public Flammeur(double PointsDeVie,double PointsArmure, double PuissanceTirSol, double PuissanceTirAir){
	
	super(PointsDeVie,PointsArmure,PuissanceTirSol,0);
	
	}   
    public boolean estVolante(){
    	return false;
    }

}

