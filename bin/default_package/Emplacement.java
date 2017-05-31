package default_package;
import flore.Vegetal;

public class Emplacement {

	private Vegetal vegetal;

	public Emplacement(final Vegetal vegetal){
		this.vegetal = vegetal;
	}

	public Vegetal getVegetal() {
		return this.vegetal;
	}

	public void setVegetal(final Vegetal vegetal) {
		this.vegetal = vegetal;
	}

	@Override
	public String toString() {
		return Character.toString(this.getVegetal().getDessin());
	}


}
