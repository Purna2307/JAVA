package animalerie;
public class TestAnimalerie{
	public static void main (String[] Args){
		Animal Valance = new Animal("Valance", 5);
		Valance.afficher();
		Valance.crier();
		
		Mamifere UnType = new Mamifere("Un type");
		UnType.afficher();
		UnType.crier();
		
		Chien tom = new Chien("Tom");
		tom.afficher();
		tom.crier();
		
		Chat purna = new Chat("purna");
		chat.afficher();
		chat.crier();
	}
}
