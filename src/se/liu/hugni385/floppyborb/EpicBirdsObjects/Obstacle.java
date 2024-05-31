package se.liu.hugni385.floppyborb.EpicBirdsObjects;

import se.liu.hugni385.floppyborb.AbstractEpicBirdObject;
import se.liu.hugni385.floppyborb.Enums.EpicBirdType;
import se.liu.hugni385.floppyborb.Enums.MovePatternType;
import se.liu.hugni385.floppyborb.Enums.SquareType;

import java.awt.*;
import java.util.List;

/**
 * An Object that can move in 4 directions according to movepatterns
 * Spawns in the far right to the screen
 * Moves Downwards and can collide with Bird
 * Obstacle have a movepattern the obstacle moves according to a scripted movepattern
 **/
public class Obstacle extends AbstractEpicBirdObject
{
    private List<MovePatternType> movepattern;

    public Obstacle(final Point position, final SquareType[][] squareTypes, EpicBirdType epicBirdType, final List<MovePatternType> movepattern) {
	super(position, squareTypes,epicBirdType);
	this.movepattern = movepattern;
    }
    ///Getters///
    public List<MovePatternType> getMovepattern() {
	return movepattern;
    }

    ///Obstacle functions///
    public void removeFirstMovePattern() {
	movepattern.remove(0);
    }

    public void moveObject() {
	if (movepattern.size() >= 1) {
	    switch (movepattern.get(0)) {
		case UP -> this.position.y -= MOVEMENT_SPEED;
		case DOWN -> this.position.y += MOVEMENT_SPEED;
		case RIGHT -> this.position.x += MOVEMENT_SPEED;
		case LEFT -> this.position.x -= MOVEMENT_SPEED;
	    }
	    removeFirstMovePattern();
	}
    }
    public boolean collisionEvent(){
	return false;
    }
}
