package se.liu.hugni385.floppyborb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Used for the visible representation of the game
 */
public class EpicBirdViewer
{
    private Board topclass;
    private JFrame frame;

    public EpicBirdViewer(final Board topclass) {
	this.topclass = topclass;
	frame = new JFrame("Floppy Borb");
	initializeInputs();
    }

    public void show(){
	frame.setSize(new Dimension(Board.GAME_WIDTH, Board.GAME_HEIGHT));
	frame.pack();
	frame.setResizable(false);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
    }

    public void updateFrame(){
	frame.repaint();
    }

    public void addComponentToFrame(EpicBirdComponent component){
	frame.add(component, BorderLayout.CENTER);
    }

    public JFrame getFrame() {
	return frame;
    }

    private class MoveAction extends AbstractAction
    {
	@Override public void actionPerformed(final ActionEvent e) {
	    if(topclass.gameRunning){
		topclass.getBird().spaceJmp();
		topclass.getBird().moveUp();
	    }
	}
    }

    private class RestartAction extends AbstractAction
    {
	@Override public void actionPerformed(final ActionEvent e) {
	    if(!topclass.gameRunning) {
		topclass.resetGame();
	    }
	}
    }

    public void initializeInputs(){
	JComponent pane = frame.getRootPane();
	InputMap inputs = pane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
	inputs.put(KeyStroke.getKeyStroke("SPACE"), "up");
	inputs.put(KeyStroke.getKeyStroke("R"), "restart");
	ActionMap actions = pane.getActionMap();
	actions.put("up", new MoveAction());
	actions.put("restart", new RestartAction());
    }
}


