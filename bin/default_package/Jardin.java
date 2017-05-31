package default_package;

import java.util.HashMap;
import java.util.Scanner;

import flore.Etat;
import flore.VegetalFactory;

public class Jardin {

	final int longueur;
	final int largeur;
	private final Emplacement emplacement[][];
	private final HashMap<String, Integer> panier;
	private String nom;

	public Jardin(final int longueur, final int largeur){
		this.longueur = longueur;
		this.largeur = largeur;
		this.emplacement = new Emplacement[longueur][largeur];
		this.panier = new HashMap<String, Integer>();

	}

	public void ajouterPanier(final String nomvegetal, final int quantitegraine){
		this.panier.put(nomvegetal, quantitegraine);
	}

	public void retirerPanier(final String nomVegetal){
		int quantite = this.panier.get(nomVegetal);
		quantite = quantite - 1;
		this.ajouterPanier(nomVegetal, quantite);
	}

	@Override
	public String toString() {
		String afficher = new String("");
		String afficher2 = new String("");
		int i = 0, j = 0;
		for (i=0; i<this.longueur; i++){
			for(j=0; j<this.largeur; j++){

				if(this.emplacement[i][j] == null){
					afficher = afficher  + "o";
				}
				else{
					afficher = afficher  + this.emplacement[i][j].toString();
				}

			}
			afficher = afficher + "\n";
		}

		for(final HashMap.Entry<String, Integer> listepanier : this.panier.entrySet()) {
			afficher2 = afficher2 + listepanier.getKey() + ": " + listepanier.getValue() + " graine(s) \n";
		}

		return "\n\nVoici notre jardin :\n" + afficher + "\nEt notre panier contient : \n" + afficher2;
	}

	public void menu() {
		final Scanner scanner = new Scanner(System.in);
		int res;

		do{
			System.out.print("\n\n###MENU### \n1.Semer une graine \n2.Récolter les plantes \n3.Passer à la saison suivante \n4.Quitter l'application");

			res = scanner.nextInt();

			switch(res){
			case 1 :
				this.semer();
				break;
			case 2 :
				this.recolte();
				break
				;
			case 3 :
				this.saisonSuivante();
				break
				;
			case 4 :
				System.out.println("\n\nAu revoir");
				break
				;
			default :
				;
			}
		}
		while(res !=4);
		System.exit(0);
	}

	public void semer(){
		System.out.println("\nQue souhaitez-vous planter?");
		for (final String nomVegetal: VegetalFactory.VegetalPossible) {
			System.out.println(nomVegetal);
		}
		final Scanner scannernom = new Scanner(System.in);
		this.nom = scannernom.nextLine();
		this.retirerPanier(this.nom);
		System.out.println("Où souhaitez-vous plantez?");
		final Scanner scannerX = new Scanner(System.in);
		final int x = scannerX.nextInt();
		final Scanner scannerY = new Scanner(System.in);
		final int y = scannerY.nextInt();
		this.emplacement[x][y] = new Emplacement(VegetalFactory.CreateVegetal(this.nom));
		System.out.print(this.toString());
	}

	public void saisonSuivante(){
		int i = 0, j = 0;
		for (i=0; i<this.longueur; i++){
			for(j=0; j<this.largeur; j++){
				if(this.emplacement[i][j] != null){
					this.emplacement[i][j].getVegetal().grandir();
				}
				else{

				}

			}

		}
		System.out.print(this.toString());

	}


	public void recolte(){
		int i = 0, j = 0;
		for (i=0; i<this.longueur; i++){
			for(j=0; j<this.largeur; j++){
				if(this.emplacement[i][j] != null && this.emplacement[i][j].getVegetal().getEtat().equals(Etat.FLEUR)){
					this.emplacement[i][j] = null;
				}
				else{

				}
			}
		}
	}

}
