package etoilecraft;

public class Cuirasse extends AUniteTerran{

	public Cuirasse(double PointsDeVie,double PointsArmure, double PuissanceTirSol, double PuissanceTirAir){
	
	super(PointsDeVie,PointsArmure,PuissanceTirSol,PuissanceTirAir);
	
	if(PuissanceTirAir <= PuissanceTirSol) throw new ArithmeticException("Faux"); 
	
	}   
    public boolean estVolante(){
    	return true;
    }

}


