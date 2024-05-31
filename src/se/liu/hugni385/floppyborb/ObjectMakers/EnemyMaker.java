package se.liu.hugni385.floppyborb.ObjectMakers;

import se.liu.hugni385.floppyborb.Enums.SquareType;

/**
 * Creates SquareType[][] for Enemy Class
 */
public class EnemyMaker
{
    public SquareType[][] makeEnemySquares(int type) {
	switch (type) {
	    case 0:
		return enemy0();
	    case 1:
		return enemy1();
	    case 2:
		return enemy2();
	    default:
		return null;
	}
    }

    public SquareType[][] enemy0() {
	    SquareType[][] obstacle = {{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY,SquareType.EMPTY },
	    { SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY,SquareType.EMPTY },
	    { SquareType.EMPTY, SquareType.RED, SquareType.RED, SquareType.RED, SquareType.RED,SquareType.RED,SquareType.EMPTY },
	    { SquareType.BLACK, SquareType.RED, SquareType.EMPTY, SquareType.RED, SquareType.EMPTY,SquareType.RED,SquareType.BLACK },
	    { SquareType.RED, SquareType.EMPTY, SquareType.EMPTY, SquareType.RED , SquareType.EMPTY,SquareType.EMPTY,SquareType.RED },
	    { SquareType.RED, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY,SquareType.RED },
	    { SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY,SquareType.EMPTY }};

	    return obstacle;
	}
    
    public SquareType[][] enemy1() {
	SquareType[][] obstacle = {
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY,SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY,SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.BLACK, SquareType.BLACK, SquareType.BLACK, SquareType.BLACK,SquareType.BLACK,SquareType.EMPTY },
		{ SquareType.BLACK, SquareType.BLACK, SquareType.EMPTY, SquareType.BLACK, SquareType.EMPTY,SquareType.BLACK,SquareType.BLACK },
		{ SquareType.BLACK, SquareType.EMPTY, SquareType.EMPTY, SquareType.BLACK , SquareType.EMPTY,SquareType.EMPTY,SquareType.BLACK },
		{ SquareType.BLACK, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY,SquareType.BLACK },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY,SquareType.EMPTY }};

	return obstacle;
    }
    
    public SquareType[][] enemy2 () {
	SquareType[][] obstacle = {
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY,SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY,SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.YELLOW, SquareType.YELLOW, SquareType.YELLOW, SquareType.YELLOW,SquareType.YELLOW,SquareType.EMPTY },
		{ SquareType.BLACK, SquareType.YELLOW, SquareType.EMPTY, SquareType.YELLOW, SquareType.EMPTY,SquareType.YELLOW,SquareType.BLACK },
		{ SquareType.YELLOW, SquareType.EMPTY, SquareType.EMPTY, SquareType.YELLOW , SquareType.EMPTY,SquareType.EMPTY,SquareType.YELLOW },
		{ SquareType.YELLOW, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY,SquareType.YELLOW },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY,SquareType.EMPTY }};

	return obstacle;
    }
}

