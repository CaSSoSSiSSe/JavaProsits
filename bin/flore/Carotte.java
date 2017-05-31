package flore;

public class Carotte extends Vegetal {

	public Carotte(){
		this.dessin[Etat.FEUILLE.ordinal()] = 'c';
		this.dessin[Etat.FLEUR.ordinal()] = 'C';
	}
}
