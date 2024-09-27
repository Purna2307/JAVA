package etoilecraft; 

public class Marin extends AUniteTerran {

	public Marin(double PointsDeVie,double PointsArmure, double PuissanceTirSol, double PuissanceTirAir){
	
	super(PointsDeVie,PointsArmure,PuissanceTirSol,PuissanceTirAir);
	
	}   
    public boolean estVolante(){
    	return false;
    }

}
