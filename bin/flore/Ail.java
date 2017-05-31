package flore;

public class Ail extends Vegetal {

	public Ail(){
		this.dessin[Etat.FEUILLE.ordinal()] = 'a';
		this.dessin[Etat.FLEUR.ordinal()] = 'A';
	}
}
