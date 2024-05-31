package se.liu.hugni385.floppyborb;

import se.liu.hugni385.floppyborb.Enums.SquareType;

import javax.swing.*;
import java.awt.*;
import java.util.EnumMap;

/**
 * Essentially "assembles" all the objects of the game and puts them in the frame.
 */


public class EpicBirdComponent extends JPanel
{
    private Board board;
    private static final int SQUARE_SIZE = 10;
    private Font pointFont = new Font("pointfont", Font.BOLD, 50);
    private final EnumMap<SquareType, Color> colorMap = createColorMap();

    public EpicBirdComponent(Board board) {
	this.board = board;
	this.setPreferredSize(new Dimension(Board.GAME_WIDTH, Board.GAME_HEIGHT));
	this.setBackground(new Color(128, 245, 250));
	this.setFocusable(true);
    }

    public int getSquareSize() {
	return SQUARE_SIZE;
    }

    public void boardChanged() {
	repaint();
    }

    private static EnumMap<SquareType, Color> createColorMap() {
	final EnumMap<SquareType, Color> colorMap = new EnumMap<>(SquareType.class);
	colorMap.put(SquareType.EMPTY,Color.PINK);
	colorMap.put(SquareType.BLACK,Color.black);
	colorMap.put(SquareType.GREY,Color.gray);
	colorMap.put(SquareType.BACKGROUND_COLOR,new Color(128, 69, 47));
	colorMap.put(SquareType.GREEN,Color.green);
	colorMap.put(SquareType.WHITE,Color.white);
	colorMap.put(SquareType.BLUE,Color.blue);
	colorMap.put(SquareType.RED,Color.red);
	colorMap.put(SquareType.YELLOW,Color.yellow);

	return colorMap;
    }

    @Override protected void paintComponent(Graphics g) {
	super.paintComponent(g);
	final Graphics2D g2d = (Graphics2D) g;
	for (EpicBirdObject epicbird: board.getEpicBirds()) {
	    drawEpicBird(g2d,epicbird);
	}
	drawEpicBird(g2d, board.getBird());
	drawPoints(g2d);
	if (!board.gameRunning) {
	    drawGameOver(g2d);
	}
    }

    public void drawPoints(final Graphics g2d){
	g2d.setColor(Color.BLACK);
	g2d.setFont(pointFont);
	g2d.drawString(Integer.toString(board.points), Board.GAME_WIDTH / 2, 50);

    }

    public void drawGameOver(final Graphics g2d) {
	g2d.setColor(Color.BLACK);
	g2d.setFont(pointFont);
	g2d.drawString("Game over! Press 'r' to play again. ", Board.GAME_WIDTH / 4, 375);
    }

	public void drawEpicBird(final Graphics g2d,EpicBirdObject epicBirdObject){
	    for (int x = 0; x < epicBirdObject.getSquaresLength(); x++) {
		for (int y = 0; y < epicBirdObject.getSquaresLength(); y++) {
		    if (epicBirdObject.getSquareType(x, y) != SquareType.EMPTY) {
			g2d.setColor(colorMap.get(epicBirdObject.getSquareType(x, y)));
			g2d.fillRect(x * SQUARE_SIZE + epicBirdObject.getPositionX(), y * SQUARE_SIZE + epicBirdObject.getPositionY(),
				     SQUARE_SIZE, SQUARE_SIZE);
		    }
		}
	    }
	}
    }
