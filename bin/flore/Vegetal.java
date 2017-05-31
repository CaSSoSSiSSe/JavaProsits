package flore;

public abstract class Vegetal {
	private Etat etat;
	char dessin[];

	public Vegetal(){
		this.dessin = new char[6];
		this.dessin[Etat.GRAINE.ordinal()] = '_';
		this.dessin[Etat.GERME.ordinal()] = '.';
		this.dessin[Etat.TIGE.ordinal()] = 'i';
		this.dessin[Etat.MORT.ordinal()] = '#';
		this.etat = Etat.GRAINE;
	}

	public Etat getEtat() {
		return this.etat;
	}

	public char getDessin() {

		return this.dessin[this.getEtat().ordinal()];
	}

	public void grandir(){
		this.etat = Etat.values()[this.etat.ordinal() + 1];
	}



}
