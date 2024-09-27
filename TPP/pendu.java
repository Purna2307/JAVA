import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class pendu{
	public static void main(String[] args){
		Scanner clavier=new Scanner(System.in);
		boolean r=false;
		char [] solution=initialiserSolution();
		
		char [] masque=creerMasque(solution.length);
		int essais=0;
		while(essais<=5 & !estFini(masque)){
			afficherEssais(essais,masque);
			System.out.println("Entrez un caractère :");
			String c=clavier.nextLine();
			System.out.println(Jouer(solution,masque,c.charAt(0)));
			if(essais==5){
				System.out.println("Le nombre maximum d'essais a été atteint: 5. Le mot à deviner était ");
				Afficher(solution);
			}
			if(Jouer(solution,masque,c.charAt(0))==false){
			essais++;
			}
		}
		if(estFini(masque)){
			r=true;
		}
		if(r==true){
			System.out.println("Gagné!");
		}
		else{
			System.out.println("Perdu !");
		}
	}
	public static boolean estValide(String s){
		boolean r=true;
		if (s.length()<4){
			r=false;
		}
		else{
			int i=0;
			while(i<s.length() & r==true){
				if(s.charAt(i)>='A' & s.charAt(i)<='Z'){
					r=true;
				}
				else{
					r=false;
				}
				i++;
			}
		}
		return r;
	}
	public static char [] Convertir(String s){
		char [] t=new char[s.length()];
		for (int i=0;i<s.length();i++){
			t[i]=s.charAt(i);
		}
		return t;	
	}
	public static char [] initialiserSolution(){
		String [] dico=lecture("liste_francais.txt");
		int aleatoire=(int)(Math.random()*nbLignes("liste_francais.txt"));
		String mot=dico[aleatoire];
		while(!estValide(mot)){
			aleatoire=(int)(Math.random()*nbLignes("liste_francais.txt"));
			mot=dico[aleatoire];
		}
		char [] t=Convertir(mot);
		return t;
	}
	public static char [] creerMasque(int n){
		char [] t=new char[n];
		for(int i=0;i<n;i++){
			t[i]='-';
		}
		return t;
	}
	public static void Afficher(char [] t){
		for(int i=0;i<t.length;i++){
			System.out.print(t[i]);
		}
	}
	public static boolean Jouer(char [] solution, char [] masque, char c){
		boolean verif=false;
		for(int i=0;i<solution.length;i++){
			if(solution[i]==c){
				verif=true;
				masque[i]=c;
			}
		}
		return verif;
	}
	public static void afficherEssais(int essais,char [] masque){
		System.out.print("Nombre de coups restants: "+(5-essais));
		System.out.println();
		Afficher(masque);
		System.out.println();
		switch(essais) {
			case 5: // La potence en entier et le pendu
				System.out.println(" /---\\\n |   |\n |   O\n |  /|\\\n |  / \\\n-^-");
				break;
			case 4: // La potence en entier
				System.out.println(" /---\\\n |   |\n |\n |\n |\n-^-");
				break;
			case 3: // La potence sans la corde
				System.out.println(" /---\\\n |\n |\n |\n |\n-^-");
				break;
			case 2: // Le corps de la potence
				System.out.println("\n |\n |\n |\n |\n-^-");
				break;
			case 1: // Le pied de la potence
				System.out.println("\n\n\n\n\n-^-");
				break;
			}
	}
	public static boolean estFini(char [] masque){
		boolean r=true;
		int i=0;
		while(i<masque.length & r==true){
			if(masque[i]=='-'){
				r=false;
			}
			i++;
		}
		return r;
	}
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
}
		
		