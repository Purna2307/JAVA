
public class TestVoitureSurface{
	public static void main (String [] args){
		Couleur c= Couleur.Rouge;
		Moteur m= new Moteur();
		Reservoir r = new reservoir();
		
		VoitureSurface v1= new VoitureSurface(m,r,c);
		Personne P1= new Personne("Addadi","Purna",19);
		Personne P2= new Personne("Addadi","Purna",10);
		
	}		



}
