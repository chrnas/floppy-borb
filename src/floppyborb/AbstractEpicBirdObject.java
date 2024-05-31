package floppyborb;

import floppyborb.enums.EpicBirdType;
import floppyborb.enums.SquareType;

import java.awt.*;

/**
 *All of the objects in Topclass extends AbstractEpicBirdObject, it includes a:
 * squareTypes a SquareType[][] Array that represents the different objects in the game
 * position Every Object has a position that makes it possible to move them around and compare thier positions
 * MOVEMENTSPEED Sets the standard movementspeed for all objects in the game
 * SQUARE_SIZE Sets the standard size of a square in the game (Pixel size)
 * @param position represents the objects position
 * @param squareTypes represents the objects body
 */
public abstract class AbstractEpicBirdObject implements EpicBirdObject
{
    protected SquareType[][] squareTypes; //All squareTypes Arrays must have cubic form
    protected Point position;
    protected static final int MOVEMENT_SPEED = 10; //All movements must follow pixel size of 10
    protected EpicBirdType epicBirdType;

    protected AbstractEpicBirdObject(final Point position, final SquareType[][] squareTypes,final EpicBirdType epicBirdType) {
	this.squareTypes = squareTypes;
	this.position = position;
	this.epicBirdType = epicBirdType;
    }

    public SquareType[][] getSquares() {
	return squareTypes;
    }

    public Point getPosition() {
	return position;
    }

    public int getPositionX() {
	return position.x;
    }

    public int getPositionY() {
	return position.y;
    }

    public int getSquaresLength() {
	return squareTypes.length;
    }

    public EpicBirdType getEpicBirdType() {
	return epicBirdType;
    }

    public SquareType getSquareType(int x, int y) {
	return squareTypes[y][x];
    }

    public boolean checkIfOutOfBounds(){
	return((position.y > Board.GAME_HEIGHT+squareTypes.length) || (position.y < -squareTypes.length) || (position.x > Board.GAME_WIDTH+50) || (position.x < -squareTypes.length));
    }
}

