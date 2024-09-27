package Packages;
public class Chien extends AMamifere{
	
	public Chien(String nom){
		super(nom);
	}
	
	public void setNom(String nom){super.setNom(nom);}
	
	public void crier(){System.out.println("ouaf, ouaf");}
	public String toString(){
		return "Chien "+super.getNom()+", mammifère "; 	
	}
	public void afficher(){System.out.println(this.toString());}
}
