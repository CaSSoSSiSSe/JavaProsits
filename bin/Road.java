
public class Road {

	public static void main(final String[] args) {
		
		int i=1;
		
		final Ditch ditch = new Ditch();
		ditch.setDitchLeft("|");
		ditch.setDitchRight("|");

		final Macadam macadam = new Macadam();
		macadam.setMacadam("     ");

		//final Obstacle obstacle = new Obstacle();
		//obstacle.setObstacle("X");


		for(i=1; i!=0; i++){
			ditch.printDitchLeft();
			macadam.printMacadam();
			ditch.printDitchRight();
		}

	}

}
