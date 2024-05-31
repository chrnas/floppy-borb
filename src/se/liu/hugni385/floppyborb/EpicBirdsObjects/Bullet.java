package se.liu.hugni385.floppyborb.EpicBirdsObjects;

import se.liu.hugni385.floppyborb.AbstractEpicBirdObject;
import se.liu.hugni385.floppyborb.Enums.EpicBirdType;
import se.liu.hugni385.floppyborb.Enums.SquareType;

import java.awt.*;

/**
 *Spawned by the enemy when Bird is in same position.x as an Enemy
 */
public class  Bullet extends AbstractEpicBirdObject
{
    public Bullet(final Point position, final SquareType[][] squareTypes, EpicBirdType epicBirdType) {
	super(position, squareTypes,epicBirdType);
    }

    public void moveObject(){
        this.position.x -= MOVEMENT_SPEED*2;
    }
    public boolean collisionEvent(){
        return false;
    }
}
