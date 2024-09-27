package animalerie;
public class Chat extends Mamifere{
	public Chat(String nom){
		super(nom,4);
	}
	public void crier(){System.out.println("gggrrr gggrrr");}
	
	public String toString(){return  "Chien"+super.nom+", mamifère à "+super.nb_pates+" pattes" ;}
	public void afficher(){System.out.println(this.toString());}
	public String getNom(){return super.getNom();}
	public String getNb_pates(){return super.getNb_pates();}
	
}
