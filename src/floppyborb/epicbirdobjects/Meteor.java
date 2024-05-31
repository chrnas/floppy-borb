package floppyborb.epicbirdobjects;

import floppyborb.AbstractEpicBirdObject;
import floppyborb.enums.EpicBirdType;
import floppyborb.enums.SquareType;

import java.awt.*;
import java.util.Random;

/**
 * Class representing a Meteor with a weight that is affected by gravity and moves the meteor down
 * Spawns in the top of the screen
 * Moves Downwards and can collide with Bird
 * safeZone makes sure the meteor doesn't spawn to close to the bird
 * meteorType determines the meteortype of the meteor, it determines the meteors weight and the size of the saveZone of the meteor
 * */
public class Meteor extends AbstractEpicBirdObject
{
    private int weight;
    private int safeZone;

	public Meteor(final Point position, final SquareType[][] squareTypes, EpicBirdType epicBirdType, int fallSpeed) {
		super(position, squareTypes,epicBirdType);
		Random random = new Random();
	    	int randomMeteorType = random.nextInt(3);
		this.weight = getMeteorWeight(randomMeteorType);

	}

    public int getWeight() {
	return weight;
    }

    public int getSafeZone() {
	return safeZone;
    }

    public int getMeteorWeight(int meteorType) {
	    switch (meteorType) {
		case 0:
		    safeZone = 100;
		    weight = 1;
		    break;
		case 1:
		    weight = 2;
		    safeZone = 200;
		    break;
		case 2:
		    weight = 3;
		    safeZone = 300;
		    break;

	    }
		return weight;
	}

	public void moveObject() {
	    this.position.x -= MOVEMENT_SPEED*2;
	    this.position.y += weight*MOVEMENT_SPEED;
	}
    public boolean collisionEvent(){
	return false;
    }
}
