class Date { 
  private int jour;
  private int mois;
  private int annee;
  
  public Date(int j, int m,int a){
    jour = j;
    mois = m;
    annee = a;
  }
  public Date(){
    jour = 0 ;
    mois = 0 ;
    annee = 0 ;
  }
  public int getJour(){
    return jour ;
  }
  public int getMois(){
    return mois;
  }
  public int getAnnee(){
    return annee;
  }
  public void setJour(int j){
   if(j>0 && j<=31){
     jour = j;
   }
   else{
     System.out.println("ERREUR");
   }
  }
  public void setMois(int m){
   if(m>0 && m<=12){
     mois = m;
   }
   else{
     System.out.println("ERREUR");
   }
  }
  public void setAnnee(int a){
   if(a>0){
     annee = a;
   }
   else{
     System.out.println("ERREUR");
   }
  }
 public String toString(){
   return (jour + "/" + mois + "/" + annee);
 }
 public void afficher(){
   System.out.println(toString());
 }
 public boolean estBissextile(){
   boolean reponse = false;
   if(this.annee%400==0){
     reponse = true;
   }
   return reponse ;
 }
  public int nbJours(){
    int nbjour=30 ;
    if(estBissextile()== true && mois == 2){
      nbjour=29;
    }
    else{
      if(mois==1 | mois==3 | mois==6 | mois==9 | mois==10 | mois==12 ){
      nbjour = 31;
    }
    else{
      if(mois==2){nbjour=28;}
      else{nbjour=30;}
      }
    }
  return nbjour;
  }
  
}
