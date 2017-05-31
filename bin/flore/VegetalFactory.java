package flore;

public abstract class VegetalFactory {
	public static  String[] VegetalPossible = {"Ail", "Tomate", "Carotte", "Betterave"};

	public static Vegetal CreateVegetal(final String nomVegetal) {
		switch (nomVegetal) {
		case "Ail":
			return createAil();
		case "Tomate":
			return createTomate();
		case "Carotte":
			return createCarotte();
		case "Betterave":
			return createBetterave();
		default:
			return null;
		}
	}

	private static Vegetal createAil() {
		return new Ail();
	}

	private static Vegetal createTomate() {
		return new Tomate();
	}

	private static Vegetal createCarotte() {
		return new Carotte();
	}

	private static Vegetal createBetterave() {
		return new Betterave();
	}
}
