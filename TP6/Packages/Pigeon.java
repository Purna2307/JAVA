package Packages;
public class Pigeon extends AOiseau{

	public Pigeon(String nom){
		super(nom);
	}
	
	public void setNom(String nom){super.setNom(nom);}
	
	public void crier(){System.out.println("rouh rouh le pigeon");}
	public String toString(){
		return "Pigeon "+super.getNom()+", oiseau "; 	
	}
	public void afficher(){System.out.println(this.toString());}
}
