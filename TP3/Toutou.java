import java.io.*;
public class Toutou{
  private String nom; 
  private Couleur couleur;
  private int puce;
  
  public Toutou ( String n,Couleur c, int p)throws IOException{
    if (p<0)throw new IllegalArgumentException("Valeurs négative enculer");
    puce=p;
    if (n ==" ") {throw new IOException("Il faut un nom enculer"); }
    this.nom=n;
    this.couleur=c;
    this.puce=p;
  }
  
  public Toutou () {
    this.nom = "Ethan";
    this.couleur = Couleur.NOIRE;
    this.puce= 0;
  }
  
  public String getNom(){return nom;}
  public Couleur getCouleur(){return couleur;}
  public int getPuce(){return puce;}
  
  public void setPuce(int p){
    if(p<0)throw new IllegalArgumentException("Valeurs négative enculer");
    puce=p;
  }
  
  public String toString(){
    return"Son nom est :"+nom+" sa couleur est :"+couleur+" il a  :"+puce+" puces";
  }
  public boolean egalA(Toutou ref){return nom.equals(ref.nom) && couleur.equals(ref.couleur);}
  public void afficher(){System.out.println(this.toString());}
}
