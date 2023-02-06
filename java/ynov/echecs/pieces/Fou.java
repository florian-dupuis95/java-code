package ynov.echecs.pieces;

import princeton.StdDraw;

public class Fou extends Piece {
	public Fou(double c, double lig, boolean blanc) {
		super(c,lig,blanc);
	}
	
	public void affiche() {
		if (this.blanc)	{
		StdDraw.picture(this.col + 0.5
				, this.lig + 0.5
				, "images/Fb.png", 1, 1);
		} else {
		StdDraw.picture(this.col + 0.5
				, this.lig + 0.5
				, "images/Fn.png", 1, 1);
		}
	}
}
