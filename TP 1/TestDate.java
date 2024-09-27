import java.util.Scanner;
class TestDate{
  public static void main (String[] args){
  Scanner clavier = new Scanner(System.in);
  
    Date Jc,JCleretour;
    
    
    Jc = new Date(31,12,1111);
    JCleretour = new Date();
    
    Jc.getJour();
    Jc.getMois();
    Jc.getAnnee();
    
    Jc.afficher();
    
    System.out.println("Entrer le jour:");
    int valeur = clavier.nextInt();
    Jc.setJour(valeur);
    System.out.println("Entrer le mois :");
    valeur =clavier.nextInt();
    Jc.setMois(valeur);
    System.out.println("Entrer l'annee :");
    valeur=clavier.nextInt();
    Jc.setAnnee(valeur);
    
    Jc.afficher();
    
    JCleretour.afficher();
    boolean reponse = Jc.estBissextile();
    System.out.println(reponse);
    System.out.println(Jc.nbJours());
    
    
    }
}
