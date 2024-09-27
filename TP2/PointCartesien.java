import java.lang.Math; 
public class PointCartesien implements IPoint {
  private double x;
  private double y;
  

  public PointCartesien (double x, double y){
    this.x = x;
    this.y = y;
  }
  
  public PointCartesien(){
    this.x=0;
    this.y=0;
  }
  
  public PointCartesien(PointCartesien p){
    this.x=p.x;
    this.y=p.y;
  }
  public double getX(){return x;}
  public double getY(){return y;}
  
  public void setX(double x){this.x=x;}
  public void setY(double y){this.y=y;}
  /**
      * Calcule la distance entre l'origine et le point
      * @return la distance entre l'origine et le point
      */
    public double distanceALOrigine(){
    	return Math.sqrt((x*x)+(y*y));
    }

    /**
      * Effectue une translation sur le point suivant le vecteur (dx,dy)
      * @param dx coordonn&eacute;e x du vecteur
      * @param dy coordonn&eacute;e y du vecteur
      */
    public void translation(double dx, double dy){
    	this.x += dx;
    	this.y += dy;
    }
    
    public String toString(){
      return("("+x+":"+y+")");
    }

    /**
      * Permet d'afficher le point &agrave; l'&eacute;cran
      */
    public void afficher(){
      System.out.println(this.toString());
    }
}
