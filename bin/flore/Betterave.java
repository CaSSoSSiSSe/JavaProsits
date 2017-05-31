package flore;

public class Betterave extends Vegetal {

	public Betterave(){
		this.dessin[Etat.FEUILLE.ordinal()] = 'b';
		this.dessin[Etat.FLEUR.ordinal()] = 'B';
	}
}
