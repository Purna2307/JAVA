import java.util.Scanner;
import java.io.*;

public class Test_Toutou{
  public static void main(String [] args) throws IOException{
    Scanner clavier = new Scanner(System.in);
    
    Toutou t1,t2 ;
    
    t1 = new Toutou("Milou", Couleur.BLANCHE, 4);
    t2 = new Toutou(" ", Couleur.CHOCOLAT,11); 
    
    System.out.println(t1.getNom());
    System.out.println(t1.getCouleur());
    System.out.println(t1.getPuce());
    System.out.println("entrer la valeur de puces");
    int p = clavier.nextInt();
    t1.setPuce(p);
    System.out.println(t1.getPuce());
    t1.afficher();
    
    System.out.println(t2.getNom());
    System.out.println(t2.getCouleur());
    System.out.println(t2.getPuce());
    System.out.println(t2.getPuce());
    t2.afficher();
  }
   
}
