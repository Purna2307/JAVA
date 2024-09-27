package Packages;
public class Chat extends AMamifere{
	
	public Chat(String nom){
		super(nom);
	}
	
	public void setNom(String nom){super.setNom(nom);}
	
	public void crier(){System.out.println("Miaou, miaou");}
	public String toString(){
		return "Chat "+super.getNom()+", mammifère"; 
		
	}
	public void afficher(){System.out.println(this.toString());}
}
