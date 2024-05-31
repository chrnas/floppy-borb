package se.liu.hugni385.floppyborb;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Used for executing the game
 */
public class RunGame
{
    private final static int TIME_DELAY = 20; //Change so time delay is smaller, balance game
    private final static int TIME_DELAY_MOVE_PATTERN = 100;
    //private Timer timer = new Timer(TIME_DELAY, null);

    public static void main(String[] args)  {
	//Choose Bird
	String stringBirdType = JOptionPane.showInputDialog("Welcome to FloppyBird, Choose bird to play with, Enter 1-3 to choose bird",1);
	int intbirdtype = Integer.parseInt(stringBirdType);
	//initialize Game
	Board topclass = new Board();
	EpicBirdComponent component = new EpicBirdComponent(topclass);
	EpicBirdViewer viewer = new EpicBirdViewer(topclass);
	viewer.addComponentToFrame(component);
	viewer.show();
	topclass.initializeGame();
	topclass.initializeBird(intbirdtype);

	final Action gameTick = new AbstractAction()
	{
	    public void actionPerformed(ActionEvent e) {
		topclass.tick();
		viewer.updateFrame();
	    }
	};

	final Timer clockTimer = new Timer(TIME_DELAY, gameTick);
	clockTimer.setCoalesce(true);
	clockTimer.start();

    }
}
