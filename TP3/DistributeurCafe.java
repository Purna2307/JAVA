public class DistributeurCafe implements Idistributeur{
  private static double  prix =0.60;
  private double cagnotte;
  private double reservoir;
  private int capacited;
  private int dosette;
  
  public DistributeurCafe(double cagnotte, double reservoir, int capacited, int dosette){ 
    this.cagnotte=cagnotte;
    this.reservoir=reservoir;
    this.capacited=capacited;
    this.dosette=dosette;
  }
  public DistributeurCafe(){
    this.cagnotte=0;
    this.reservoir= 2; 
    this.capacited = 10;
    this.dosette=10;
    
  }
  
  public DistributeruCafe(DistributeruCafe ref){
    this.cagnotte=ref.cagnotte;
    this.reservoir=ref.reservoir;
    this.capacited=ref.capacited;
    this.dosette=ref.dosette;
  }
  
  public static double getPrix(){return prix;}
  public double getCagnotte(){return cagnotte;}
  public double getReservoir(){return reservoir;}
  public int getCapacited(){return capacited;}
  public int getDosette(){return dosette;}
  
  public static void setPrix(double p){prix=p;}
  public void setCagnotte(double c){cagnotte=c;}
  public void setResevoir(double r){reservoir=r;}
  public void setDosette(int d){dosette=d;}
  
  public String toString(){
   return "Le prix du café :"+prix+"il y a:"+cagnotte+"dans la cagnotte, il reste"+reservoir+"d'eau, il reste "+dosette+"dosette sur"+capacited;
   }
  public void afficher(){
  System.out.println(this.toString());
  }
  
  public BoireCafeCourt (double monnaie){
    reservoir-=0.10;
    dosette--;
    return monnaie-prix;  
  }
    public BoireCafeLong (double monnaie){
    reservoir-=0.25;
    dosette--;
    return monnaie-prix;  
  }
}
