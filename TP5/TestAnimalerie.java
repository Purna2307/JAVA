public class TestAnimalerie{
	public static void main(String[] Args){
		Animal A1 = new Animal("mouton",4);
		
		A1.crier();
		A1.afficher();
		
		Mamifere M1 = new Mamifere("loup");
		
		M1.crier();
		M1.afficher();
		
		Chien CE = new Chien("Oslo");
		
		CE.crier();
		CE.afficher();
		
		Chat CA = new Chat("Moon");
		
		CA.crier();
		CA.afficher();
	}
	
}