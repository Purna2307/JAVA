package packages;
public class Chat extends Mamifere{
	
	public Chat(String nom){
		super(nom);
	}
	
	public void setNom(String nom){super.setNom(nom);}
	
	public void crier(){System.out.println("Miaou, miaou");}
	public String toString(){
		return "Chat "+super.getNom()+", mammifère à 4 pattes"; 
		
	}
	public void afficher(){System.out.println(this.toString());}
}