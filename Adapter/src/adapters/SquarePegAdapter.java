package adapters;

import round.RoundPeg;
import square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
	private SquarePeg peg;

	public SquarePegAdapter(SquarePeg peg) {
		super();
		this.peg = peg;
	}
	
	
	public double getRadius() {
		double result;
		// Calcule a minimum circle radius, which can fit this peg.
		
		result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
		
		return result;
	}
	
	

}
