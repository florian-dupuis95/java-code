package ynov.echecs;

import java.util.ArrayList;
import java.util.List;

import princeton.StdDraw;
import ynov.echecs.pieces.*;

public class JeuEchecs {
	
	public JeuEchecs() {
		StdDraw.setCanvasSize(600,600);
		StdDraw.setXscale(0,8);
		StdDraw.setYscale(0,8);
		
		this.pieces = new ArrayList<Piece>();
		this.pieces.add( new Dame(3,0,true) );
		this.pieces.add( new Roi(4,0,true) );
		this.pieces.add( new Dame(3,7,false) );
		this.pieces.add( new Roi(4,7,false) );
		this.pieces.add( new Fou(2,0,true) );
		this.pieces.add( new Fou(5,0,true) );
		this.pieces.add( new Fou(2,7,false) );
		this.pieces.add( new Fou(5,7,false) );
		for (int col = 0; col < 8; col++) {
			this.pieces.add( new Pion(col,1,true) );
			this.pieces.add( new Pion(col,6,false) );			
		}
	}
	
	public List<Piece> pieces;

	public void affiche() {
		for (int lig = 0; lig < 8; lig++)
		{
			for (int col = 0; col < 8; col = col + 1)
			{
				if ((col+lig) % 2 == 0)
				{
					StdDraw.setPenColor(StdDraw.DARK_GRAY);
				}
				else
				{
					StdDraw.setPenColor(StdDraw.BOOK_RED);
				}
				StdDraw.filledSquare(col + 0.5, lig +  0.5, 0.5);
			}
		}
		
		for (Piece piece: this.pieces) {
			piece.affiche();
		}
	}
	public void attendreClic(){
		while( StdDraw.isMousePressed() == false){
			StdDraw.pause(100);
		}
		while( StdDraw.isMousePressed() == true){
			StdDraw.pause(100);
		}
	}
	
}
