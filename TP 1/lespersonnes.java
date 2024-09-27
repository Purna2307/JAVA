class Personne{
  private String nom;
  private String prenom;
  private String civil;
  private int age;
  private int poid;
  private int taille;
  
  public Personne(String n, String p, String c, int a,int po,int t){
    nom = n;
    prenom = p;
    civil = c;
    age = a;
    poid = po;
    taille = t;
  }

  public Personne(String n, String p, String c, int a,int po,int t){
    nom = "";
    prenom = "";
    civil = "";
    age = 0;
    poid = 0;
    taille = 0;
  }
  
 }
