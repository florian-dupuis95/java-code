package ynov.echecs.pieces;

import princeton.StdDraw;

public abstract class Piece {
	
	public double col;
	public double lig;
	public boolean blanc;
	
	public Piece(double c, double lig, boolean blanc) {
		col = c;
		this.lig = lig;
		this.blanc = blanc;
	}
	
	public abstract void affiche();

}
