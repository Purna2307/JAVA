import Packages.*;
public class TestAnimalerie{
	public static void main(String[] Args){
		AAnimal A1 = new AAnimal("mouton",4);
		
		A1.afficher();
		
		AMamifere M1 = new AMamifere("loup");
		
		M1.afficher();
		
		Chien CE = new Chien("Oslo");
		
		CE.crier();
		CE.afficher();
		
		Chat CA = new Chat("Moon");
		
		CA.crier();
		CA.afficher();
		
		Abeille B1 = new Abeille ("Maya",4);
		
		B1.crier();
		B1.afficher();
		
		Pigeon P1 = new Pigeon("Hector");
		
		P1.crier();
		P1.afficher();
		
		AInsect I1 = new AInsect("l'insect",6);
		

		I1.afficher();
		
		AOiseau O1 = new AOiseau("oiseau");
		
		O1.afficher();
	}
	
}
