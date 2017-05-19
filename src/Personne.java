
public class Personne {

	public String nom = "";
	public String prenom = "";

	public void direBonjour(){
		System.out.println("Bonjour, je m'appelle " + this.prenom + " " + this.nom);
	}


	public String getNom() {
		return this.nom;
	}
	public void setNom(final String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return this.prenom;
	}
	public void setPrenom(final String prenom) {
		this.prenom = prenom;
	}


}
