package packages;
public class Mamifere extends Animal{
	
	public Mamifere(String nom){
		super(nom,4);
	}
	
	public void setNom(String nom){super.setNom(nom);}
	
	public void crier(){System.out.println("Hum, Hum");}
	public String toString(){
		return super.getNom()+", mamifère à 4 pattes" ;
		}
	
	public void afficher(){System.out.println(this.toString());}

}
