package floppyborb.epicbirdobjects;
import floppyborb.AbstractEpicBirdObject;
import floppyborb.enums.EpicBirdType;
import floppyborb.enums.SquareType;
import floppyborb.Board;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
/**
 * Class representing the player
 * Can be moved upwards using SPACE
 * Can collide with other objects in the game
 */
public class Bird extends AbstractEpicBirdObject
{
    private int jumpSpeed;
    private int weight; //Must be able to divide weight even with 10

    final private Timer timerSpaceJump;
    private boolean flyingUp = false;

    public Bird(final Point position, final SquareType[][] squareTypes, EpicBirdType epicBirdType, int jumpSpeed, int timerDelay) {
	super(position, squareTypes,epicBirdType);
	this.jumpSpeed = jumpSpeed;
	Action actionSpaceJump = new AbstractAction()
	{
	    public void actionPerformed(ActionEvent e) {
		flyingUp = false;
		timerSpaceJump.stop();
	    }
	};
	this.timerSpaceJump = new Timer(timerDelay, actionSpaceJump);
    }
    //Getters
    public boolean isFlyingUp() {
	return flyingUp;
    }

    //functions
    public void moveUp() {
	this.position.y -= MOVEMENT_SPEED * jumpSpeed;
    }

    public void spaceJmp() {
	timerSpaceJump.setCoalesce(true);
	timerSpaceJump.start();
	flyingUp = true;
    }

    public void moveObject() { //Changes how fast the specific bird falls.
	this.position.y += MOVEMENT_SPEED;
    }

    public boolean collisionEvent(){
	//collision event
	return true;
    }
    public boolean outOfBoundsEvent(){
	int posY = Board.GAME_HEIGHT - 40; // Marks the bottom of the screen.
	if(position.y > posY){
	    position.y = posY;
	}
	if (position.y < 0){
	    position.y = 0;
	}
	return false;
    }
}
