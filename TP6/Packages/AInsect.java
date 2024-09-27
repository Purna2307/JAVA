package Packages;
public abstract class AInsect extends AAnimal{

	public AInsect(String nom){
		super(nom,6,12);
	}
	public abstract void crier();
	public String toString(){
		return super.getNom()+", insecte à "+super.getNbl() ;
		}
	
	public void afficher(){System.out.println(this.toString());}

}
