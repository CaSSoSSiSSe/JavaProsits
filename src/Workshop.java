
public class Workshop {

	public static void main(String[] args) {
		//System.out.println("Hello.World");
		Personne unePersonne = new Personne(); 
		unePersonne.nom = "NERAUD";
		unePersonne.prenom = "Yohann";
		//unePersonne.direBonjour(); 
		
		System.out.println("Bonjour, je m'appelle " + unePersonne.getNom() + " " + unePersonne.getPrenom());

	}

}
