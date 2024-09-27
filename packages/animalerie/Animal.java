package animalerie;
public class Animal implements IAnimal{
	private String nom ;
	private int nb_pates ;
	
	public Animal(Animal ref){
		this.nom=ref.nom;
		this.nb_pates=ref.nb_pates;
	
	}
	
	public Animal(String nom, int nb_pates){
		this.nom = nom;
		this.nb_pates=nb_pates;
	}
	
	public String getNom(){return nom;}
	public int getNb_pates(){return nb_pates;}
	
	public void setNom(String nom){this.nom=nom;}
	 
    public void crier(){System.out.println("America fuck yeah");}
    
    public String toString(){
    	return nom+", animal à "+nb_pates+" pattes";
    }
    public void afficher(){System.out.println(this.toString());}
    
}
