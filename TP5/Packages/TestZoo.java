package packages;
import java.io.*;
public class TestZoo {
	public static void main (String[] args){
		Zoo Z1 = new Zoo();
		try{
			Zoo Z2 =new Zoo(4);
		}catch(IOException e){
			System.out.println("interception de "+ e.getMessage());
		}
		Animal A1 = new Animal("LeChien",4);
		Animal A2 = new Animal("LeChien2",4);
		Animal A3 = new Animal("LeChien3",4);
		Animal A4 = new Animal("LeChien4",4);
		Animal A5 = new Animal("LeChien5",4);
		Z1.ajouterAnimal(A1,1);
		Z1.ajouterAnimal(A2,2);
		Z1.ajouterAnimal(A3,3);
		Z1.ajouterAnimal(A4,4);
		Z1.ajouterAnimal(A5,5);
		Z1.afficher();
		System.out.println(Z1.getAnimal(1));
		Z1.supprimerAnimal(1);
		Z1.faireCrier();
		Z1.afficher();
		
	}
}