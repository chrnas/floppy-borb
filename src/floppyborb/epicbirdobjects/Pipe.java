package floppyborb.epicbirdobjects;

import floppyborb.AbstractEpicBirdObject;
import floppyborb.enums.EpicBirdType;
import floppyborb.enums.SquareType;

import java.awt.*;

/**
 * An Object that can move in 4 directions according to movepatterns
 * Spawns in the far right to the screen
 * Moves Left and can collide with Bird
 * Creates a visible effect that the bird is moving forward
 **/
public class Pipe extends AbstractEpicBirdObject
{
    public Pipe(final Point position, final SquareType[][] squareTypes, EpicBirdType epicBirdType) {
        super(position, squareTypes,epicBirdType);
    }

    public void moveObject(){
        this.position.x -= MOVEMENT_SPEED;
    }

    public boolean collisionEvent(){
        return false;
    }
}

