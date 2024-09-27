import java.io.*;
public class TestZoo {
	public static void main (String[] args){
		Zoo Z1 = new Zoo();
		try{
			Zoo Z2 =new Zoo(4);
		}catch(IOException e){
			System.out.println("interception de "+ e.getMessage());
		}
		AAnimal A1 = new AAnimal("LeChien",4);
		AAnimal A2 = new AAnimal("LeChien2",4);
		AAnimal A3 = new AAnimal("LeChien3",4);
		AAnimal A4 = new AAnimal("LeChien4",4);
		AAnimal A5 = new AAnimal("LeChien5",4);
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
