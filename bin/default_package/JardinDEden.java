package default_package;


public class JardinDEden {

	public static void main(final String[] args) {

		final Jardin jardin = new Jardin(3, 5);
		jardin.ajouterPanier("Tomate", 5);
		jardin.ajouterPanier("Carotte", 5);
		jardin.ajouterPanier("Ail", 10);
		jardin.ajouterPanier("Betterave", 5);
		jardin.menu();


		System.out.println(jardin.toString());

	}

}
