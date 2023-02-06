package ynov.echecs.pieces;

import princeton.StdDraw;

public class Roi extends Piece {
	public Roi(double c, double lig, boolean blanc) {
		super(c,lig,blanc);
	}

	@Override
	public void affiche() {
		if (this.blanc)	{
		StdDraw.picture(this.col + 0.5
				, this.lig + 0.5
				, "images/Rb.png", 1, 1);
		} else {
		StdDraw.picture(this.col + 0.5
				, this.lig + 0.5
				, "images/Rn.png", 1, 1);
		}
	}
}
