package floppyborb.epicbirdobjects;

import floppyborb.AbstractEpicBirdObject;
import floppyborb.enums.EpicBirdType;
import floppyborb.enums.PowerUpType;
import floppyborb.enums.SquareType;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * An object that the bird can collide with and different events can occur depending on the poweruptype
 **/
public class Powerup extends AbstractEpicBirdObject
{
    protected Timer powerupTimer;
    public PowerUpType powerupType;
    public boolean powerupActivated = false;
    public final Action powerupAction = new AbstractAction() {
	public void actionPerformed(ActionEvent e) {
	    powerupTimer.stop();
	    powerupActivated = false;}
    };

    public Powerup(final Point position, final SquareType[][] squareTypes, EpicBirdType epicBirdType, final int timerDelay, PowerUpType powerupType) {
	super(position, squareTypes,epicBirdType);
	powerupTimer = new Timer(timerDelay, powerupAction);
	this.powerupType = powerupType;
    }

    public void activatePowerup(){
	powerupTimer.start();
	powerupTimer.setCoalesce(true);
	powerupActivated = true;
    }

    public Timer getPowerupTimer() {
	return powerupTimer;
    }

    public PowerUpType getPowerupType() {
	return powerupType;
    }

    public boolean isPowerupActivated() {
	return powerupActivated;
    }

    public Action getPowerupAction() {
	return powerupAction;
    }

    public void dissapear(){
	squareTypes = new SquareType[][] { {SquareType.EMPTY }};

    }
    public void moveObject(){
	this.position.x -= MOVEMENT_SPEED;
    }

    public boolean collisionEvent(){
	activatePowerup();
	dissapear();
	return true;
    }
}
