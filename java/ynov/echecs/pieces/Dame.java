package ynov.echecs.pieces;

import princeton.StdDraw;

public class Dame extends Piece {
	public Dame(double c, double lig, boolean blanc) {
		super(c,lig,blanc);
	}
	
	public void affiche() {
		if (this.blanc)	{
		StdDraw.picture(this.col + 0.5
				, this.lig + 0.5
				, "images/Db.png", 1, 1);
		} else {
		StdDraw.picture(this.col + 0.5
				, this.lig + 0.5
				, "images/Dn.png", 1, 1);
		}
	}
}
