
public class Ditch {

	public String DitchLeft = "";
	public String DitchRight = "";

	public void printDitchLeft(){
		System.out.print(this.DitchLeft);
	}

	public void printDitchRight(){
		System.out.println(this.DitchRight);
	}

	public String getDitchRight() {
		return this.DitchRight;
	}

	public void setDitchRight(final String ditchRight) {
		this.DitchRight = ditchRight;
	}

	public String getDitchLeft() {
		return this.DitchLeft;
	}

	public void setDitchLeft(final String ditchLeft) {
		this.DitchLeft = ditchLeft;
	}


}
