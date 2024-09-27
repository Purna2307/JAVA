package Packages;
public abstract class AOiseau extends AAnimal{

	public AOiseau(String nom){
		super(nom,2,2);
	}
	
	public void setNom(String nom){super.setNom(nom);}
	
	public abstract void crier();
	public String toString(){
		return super.getNom()+", oiseau." ;
		}
	
	public void afficher(){System.out.println(this.toString());}

}
