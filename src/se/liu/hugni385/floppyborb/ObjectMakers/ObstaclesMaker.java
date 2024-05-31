package se.liu.hugni385.floppyborb.ObjectMakers;

import se.liu.hugni385.floppyborb.Enums.SquareType;

/**
 * Creates SquareType[][] for Obstacles Class
 */
public class ObstaclesMaker
{
    public SquareType[][] makeObstaclesSquares(int type) {
	switch (type) {
	    case 0:
		return obstacles0();
	    case 1:
		return obstacles1();
	    case 2:
		return obstacles2();
	    default:
		return null;
	}
    }

    public SquareType[][] obstacles0() {
	{
	    SquareType[][] obstacle = { { SquareType.EMPTY, SquareType.EMPTY, SquareType.WHITE, SquareType.EMPTY, SquareType.EMPTY },
		    { SquareType.RED, SquareType.RED, SquareType.BLACK, SquareType.RED, SquareType.RED },
		    { SquareType.RED, SquareType.RED, SquareType.BLACK, SquareType.RED, SquareType.RED },
		    { SquareType.EMPTY, SquareType.EMPTY, SquareType.BLACK, SquareType.EMPTY, SquareType.EMPTY },
		    { SquareType.EMPTY, SquareType.EMPTY, SquareType.BLACK, SquareType.EMPTY, SquareType.EMPTY } };

	    return obstacle;
	}
    }

    public SquareType[][] obstacles1 () {
	{
	    SquareType[][] obstacle = {
		    { SquareType.GREY, SquareType.GREY, SquareType.YELLOW, SquareType.GREY, SquareType.GREY },
		    { SquareType.EMPTY, SquareType.GREY, SquareType.BLACK, SquareType.GREY, SquareType.EMPTY },
		    { SquareType.EMPTY, SquareType.EMPTY, SquareType.BLACK, SquareType.EMPTY, SquareType.EMPTY },
		    { SquareType.EMPTY, SquareType.GREY, SquareType.BLACK, SquareType.GREY, SquareType.EMPTY },
		    { SquareType.GREY, SquareType.GREY, SquareType.EMPTY, SquareType.GREY, SquareType.GREY } };

	    return obstacle;
	}

    }

    public SquareType[][] obstacles2 () {
	SquareType[][] obstacle = {
		{ SquareType.YELLOW, SquareType.EMPTY, SquareType.RED, SquareType.EMPTY, SquareType.YELLOW },
		{ SquareType.YELLOW, SquareType.YELLOW, SquareType.BLACK, SquareType.YELLOW, SquareType.YELLOW },
		{ SquareType.EMPTY, SquareType.YELLOW, SquareType.BLACK, SquareType.YELLOW, SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.BLACK, SquareType.EMPTY, SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY } };

	return obstacle;
    }
}
