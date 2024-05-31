package floppyborb;

import floppyborb.enums.EpicBirdType;
import floppyborb.epicbirdobjects.Bird;
import floppyborb.enums.SquareType;
import floppyborb.epicbirdobjects.Powerup;

/**
 * Contains functions handling collisions beetween objects
 */
public class CollisionHandler
{
    protected Board topClass;
    private static final int SQUARE_SIZE = 10;

    public CollisionHandler(final Board topClass) {
	this.topClass = topClass;
    }

    public boolean checkPossibleCollision(Bird bird, EpicBirdObject object){
	//Represent all of the objects Squares in row Y
	for (int objectX = 0; objectX < object.getSquaresLength(); objectX++) {
	    int objectPositionX = object.getPositionX() + SQUARE_SIZE * objectX;
	    //Represent all of the objects Squares in column X
	    int border = 1530;
	    if(objectPositionX > border){
		break;
	    }
	    for (int objectY = 0; objectY < object.getSquaresLength(); objectY++) {
		int objectPositionY = object.getPositionY() + SQUARE_SIZE * objectY;
		if (objectPositionY > Board.GAME_HEIGHT){
		    break;
		}
		if((((object instanceof Powerup) && (objectX == 0 || objectX == object.getSquaresLength() - 1 || objectY == 0 || objectY == object.getSquaresLength() - 1)) || (object.getEpicBirdType() != EpicBirdType.POWERUP))){
		    //Represent all of the birds Squares in row Y
		    for (int birdX = 0; birdX < bird.getSquaresLength(); birdX++) {
			int birdPositionX = bird.getPositionX() + SQUARE_SIZE * birdX;
			//Represent all of the birds Squares in column X
			for (int birdY = 0; birdY < bird.getSquaresLength(); birdY++) {
			    int birdPositionY = bird.getPositionY() + SQUARE_SIZE * birdY;
			    //Check if cordinate have same position
			    if (checkSameCord(birdPositionX, birdPositionY, objectPositionX, objectPositionY)) {
				//Check if Squares at same position collide
				SquareType birdSquare = bird.getSquareType(birdX, birdY);
				SquareType objectSquare = object.getSquareType(objectX, objectY);
				if (checkIfSquaresCollide(birdSquare, objectSquare)) {
				    return true;
				}
			    }
			}
		    }
		}
	    }
	}
	return false;
    }

    public boolean checkIfSquaresCollide(SquareType square1, SquareType square2){
	if (square1 == SquareType.EMPTY || square2 == SquareType.EMPTY){
	    return false;
	}
	else{
	    return true;
	}
    }

    public boolean checkSameCord(int x1,int y1, int x2, int y2){
	return (x1 == x2 && y1 == y2);
    }
}
