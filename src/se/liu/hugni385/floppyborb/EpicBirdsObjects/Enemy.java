package se.liu.hugni385.floppyborb.EpicBirdsObjects;

import se.liu.hugni385.floppyborb.AbstractEpicBirdObject;
import se.liu.hugni385.floppyborb.ObjectMakers.BulletMaker;
import se.liu.hugni385.floppyborb.Enums.EpicBirdType;
import se.liu.hugni385.floppyborb.Enums.SquareType;
import se.liu.hugni385.floppyborb.Board;

import java.awt.*;

/**
 *Class representing an Enemy
 *Can shoot bullets that can collide with the Bird
 * Searches for player and moves according to the movement of the player
 */
public class Enemy extends AbstractEpicBirdObject
{
    private BulletMaker bulletMaker;

    public Enemy(final Point position, final SquareType[][] squareTypes, EpicBirdType epicBirdType) {
	super(position,squareTypes,epicBirdType);
	this.bulletMaker = new BulletMaker();
    }

    public void moveObject(){
	this.position.x -= MOVEMENT_SPEED;
    }

    public void moveAfterPlayer(Bird bird){
	if (bird.getPositionY() > position.y){
	    this.position.y += MOVEMENT_SPEED;
	}
	if (bird.getPositionY() < position.y){
	    this.position.y -= MOVEMENT_SPEED;
	}
    }

    public void spawnBullet(Board topClass){
	Bullet bullet = new Bullet(new Point(position), bulletMaker.makeBulletsSquares(0), EpicBirdType.BULLET);
	topClass.addEpicbird(bullet);
    }
    public boolean collisionEvent(){
	return false;
    }
}
