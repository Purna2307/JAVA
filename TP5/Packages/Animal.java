package packages;
public class Animal implements IAnimal{
	private String nom ;
	private int nbp ;
	
	public Animal(String nom, int nbp){
		this.nom = nom;
		this.nbp=nbp;
	}
	
	public String getNom(){return nom;}
	public int getNbp(){return nbp;}
	
	public void setNom(String nom){this.nom=nom;}
	 
    public void crier(){System.out.println("Hum, Hum");}
    
    public String toString(){
    	return nom+", animal à "+nbp+" pattes";
    }
    public void afficher(){System.out.println(this.toString());}
    
}
