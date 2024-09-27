import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Exemple {
    
    public static int nbLignes(String nomFichier) {
        int resultat = 0;
        String tmp;
        
        try {
            // Ouverture du fichier
            File f = new File(nomFichier);

            // Lecture de chaque ligne du fichier => compte les mots
            Scanner scanner = new Scanner(f);
            while(scanner.hasNextLine()) {
                tmp = scanner.nextLine();
                resultat++;
            }
            scanner.close();
        } catch(IOException e) {
            System.err.println("Erreur lors de la lecture du fichier.");
            System.err.println(e);
            System.exit(0);
        }
        
        return resultat;
    }
		public static String [] lecture(String nomFichier) {
        int i = 0;
        String tmp;
		String [] t=new String[nbLignes(nomFichier)];
        
        try {
            // Ouverture du fichier
            File f = new File(nomFichier);

            // Lecture de chaque ligne du fichier => compte les mots
            Scanner scanner = new Scanner(f);
            while(scanner.hasNextLine()) {
                t[i] = scanner.nextLine();
                i++;
            }
            scanner.close();
        } catch(IOException e) {
            System.err.println("Erreur lors de la lecture du fichier.");
            System.err.println(e);
            System.exit(0);
        }
        
        return t;
    }
    
    public static void main(String[] args) {
        int nb = nbLignes("liste_francais.txt");
        
        System.out.println(lecture("liste_francais.txt"));
    }
    
	Scanner clavier=new Scanner(System.in);
		String mot=clavier.nextLine();
		while(!estValide(mot)){
			System.out.print("Entrez un mot valide: ");
			mot=clavier.nextLine();
		}
		char [] t=Convertir(mot);
		return t;
}