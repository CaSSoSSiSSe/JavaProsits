package flore;

public class Tomate extends Vegetal {

	public Tomate(){
		this.dessin[Etat.FEUILLE.ordinal()] = 't';
		this.dessin[Etat.FLEUR.ordinal()] = 'T';
	}
}
