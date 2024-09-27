package animalerie;
public class Chien extends Mamifere{
	public Chien(String nom){
		super(nom,4);
	}
	public void crier(){System.out.println("wouf wouf");} 
	public String toString(){return  "Chat"+super.nom+", mamifère à "+super.nb_pates+" pattes" ;}
	public void afficher(){System.out.println(this.toString());}
	public String getNom(){return super.getNom();}
	public String getNb_pates(){return super.getNb_pates();}
}
