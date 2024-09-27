package Packages;
public abstract class AAnimal implements IAnimal{
	private String nom ;
	private int nbp ;
	private int nbl ;
	
	public AAnimal(String nom, int nbp, int nbl){
		this.nom = nom;
		this.nbp=nbp;
		this.nbl=nbl;
	}
	
	public String getNom(){return nom;}
	public int getNbp(){return nbp;}
	public int getNbl(){return nbl;}
	
	public void setNom(String nom){this.nom=nom;}
	 
    public abstract void crier();
    
    public String toString(){
    	return nom+", animal à "+nbp+" pattes et "+nbl;
    }
    public void afficher(){System.out.println(this.toString());}
    
}
