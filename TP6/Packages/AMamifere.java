package Packages;
public abstract class AMamifere extends AAnimal{
	
	public AMamifere(String nom){
		super(nom,4,0);
	}
	
	public void setNom(String nom){super.setNom(nom);}
	
	public abstract void crier();
	public String toString(){
		return super.getNom()+", mammifère" ;
		}
	
	public void afficher(){System.out.println(this.toString());}

}
