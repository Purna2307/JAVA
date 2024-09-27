package animalerie;
public class Mamifere extends Animal{
	
	public Mamifere(String nom){
		super(nom,4);
	}
	public void crier(){System.out.println("America fuck yeah");}
	public void toString(){return super.nom+", mamifère à "+super.nb_pates+" pattes" ;}
	public void afficher(){System.out.println(this.toString());}
	public String getNom(){return super.getNom();}
	public String getNb_pates(){return super.getNb_pates();}
}
