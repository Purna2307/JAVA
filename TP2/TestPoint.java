import java.util.Scanner; 

class TestPoint{
  public static void main (String[] args){
    Scanner clavier = new Scanner(System.in);
  
    PointPolaire point1;
  
    point1 = new PointPolaire(2,5);
  
    System.out.println(point1.getDistance());
    System.out.println(point1.getAngle());
    System.out.println("entrer la valeur de x");
    double a = clavier.nextDouble();
    point1.setDistance(a);
    System.out.println("entrer la valeur de y");
    double b = clavier.nextDouble();
    point1.setAngle(b);
    
    point1.afficher();
    
    System.out.println("distance a l'origine :"+point1.distanceALOrigine());
    
    System.out.println("Entrer les coordonnée dx du vecteur");
    
    double dx = clavier.nextDouble(); 
    System.out.println("Entrer les coordonnée dy du vecteur");
    double dy = clavier.nextDouble(); 
    
    point1.translation(dx,dy);
    point1.afficher();
  }  
} 



