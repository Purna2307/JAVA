import java.lang.Math; 
public class PointPolaire implements IPoint {
  private double distance;
  private double angle;
  
   public PointPolaire (double distance, double angle){
    this.distance = distance;
    this.angle = angle;
  }
  
  public PointPolaire(){
    this.distance=0;
    this.angle=0;
  }
  public PointPolaire(PointPolaire p){
    this.distance=p.distance;
    this.angle=p.angle;
  }
  public double getDistance(){return distance;}
  public double getAngle(){return angle;}
  
  public void setDistance(double distance){this.distance=distance;}
  public void setAngle(double angle){this.angle=angle;}

  /**
      * Calcule la distance entre l'origine et le point
      * @return la distance entre l'origine et le point
      */
    public double distanceALOrigine(){
    	return distance ;
    }

    /**
      * Effectue une translation sur le point suivant le vecteur (dx,dy)
      * @param dx coordonn&eacute;e x du vecteur
      * @param dy coordonn&eacute;e y du vecteur
      */
    public void translation(double dx, double dy){
    	this.distance =  Math.cos(angle*360/2/Math.PI)*dx;
    	this.angle =  Math.sin(angle*360/2/Math.PI)*dy;
    }
    
    public String toString(){
      return("("+distance+":"+angle+")");
    }

    /**
      * Permet d'afficher le point &agrave; l'&eacute;cran
      */
    public void afficher(){
      System.out.println(this.toString());
    }
}
