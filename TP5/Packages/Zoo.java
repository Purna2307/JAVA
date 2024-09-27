package packages;
import java.io.*;
import java.lang.Math ;
public class Zoo implements IZoo{
	private Animal[] nbcage;
	private static final int maximun = 20 ;
	private static final int minimum = 10 ;
	public Zoo(){
		nbcage = new Animal[(int)(minimum + Math.random()*(maximun-minimum))];
	}
	public Zoo(int nb)throws IOException{
		if(minimum>nb || nb>maximun){
			throw new IOException("nombre de cage incorrecte");
		}
		else{
			nbcage = new Animal[nb];
		}
	}
	
    public void ajouterAnimal(Animal a, int i){
		nbcage[i]=a;
	}
 
   
    public Animal getAnimal(int i){return nbcage[i];}
 
   
    public void supprimerAnimal(int i){nbcage[i]=null;}
 

    public void faireCrier(){
		int i=0;
		while(i<nbcage.length){
			if(nbcage[i]!=null){
				nbcage[i].crier();
				i++;
			}
			else{
				i++;
			}
		}
		
	}
 
    
    public String toString(){
		String reponse="";
		for(int i=0;i<nbcage.length;i++){
			if(nbcage[i]!=null){
				reponse +="/Cage "+i+" "+nbcage[i].toString()+"/ ";
			}
			else{
				reponse+="/Cage "+i+" vide/ ";
			}
		}
		return reponse;
	}
	
	public void afficher(){System.out.println(this.toString());}	
}