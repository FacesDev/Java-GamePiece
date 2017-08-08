package com.company;

public class Main {

    public static void main(String[] args) {
	GamePiece king = new GamePiece();

	king.setName("King");
	king.setColor("Red");

	king.getColor();
	king.getName();

	king.getisFrozen();

	king.Freeze();
	king.getisFrozen();

	king.unFreeze();
	king.getisFrozen();

    king.getPositionX();
    king.getPositionY();
    king.Move();
    king.getPositionX();
    king.getPositionY();

    king.Freeze();
    king.Move();

    }
}
