package packages;
public class Chien extends Mamifere{
	
	public Chien(String nom){
		super(nom);
	}
	
	public void setNom(String nom){super.setNom(nom);}
	
	public void crier(){System.out.println("ouaf, ouaf");}
	public String toString(){
		return "Chien "+super.getNom()+", mammifère à 4 pattes"; 	
	}
	public void afficher(){System.out.println(this.toString());}
}