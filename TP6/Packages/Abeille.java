package Packages;
public class Abeille extends AInsect{
	
	public Abeille(String nom){
		super(nom);
	}
	
	public void setNom(String nom){super.setNom(nom);}
	
	public void crier(){System.out.println("bzzz, bzzz voilà frer");}
	public String toString(){
		return "Abeille "+super.getNom()+", insecte "; 	
	}
	public void afficher(){System.out.println(this.toString());}
}
