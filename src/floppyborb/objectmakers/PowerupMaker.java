package floppyborb.objectmakers;

import floppyborb.enums.SquareType;

/**
 * Creates SquareType[][] for Powerup Class
 */
public class PowerupMaker
{
    public SquareType[][] makePowerup(int type) {
	switch (type) {
	    case 0:
		return powerupSpeed();
	    case 1:
		return powerup1();
	    case 2:
		return powerup2();
	    case 3:
		return powerup3();
	    default:
		return null;
	}
    }

    public SquareType[][] powerupSpeed() {
	{
	    SquareType[][] meteor = {{SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY},
		    {SquareType.EMPTY, SquareType.YELLOW, SquareType.YELLOW, SquareType.EMPTY, SquareType.EMPTY},
		    {SquareType.YELLOW, SquareType.BLACK, SquareType.BLACK, SquareType.YELLOW, SquareType.EMPTY},
		    {SquareType.YELLOW, SquareType.BLACK, SquareType.BLACK, SquareType.YELLOW, SquareType.EMPTY},
		    {SquareType.EMPTY, SquareType.YELLOW, SquareType.YELLOW, SquareType.EMPTY, SquareType.EMPTY}
	    };
	    return meteor;
	}
    }

    public SquareType[][] powerup1() {
	{
	    SquareType[][] meteor =
		    {{SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY},
			    {SquareType.EMPTY, SquareType.RED, SquareType.RED, SquareType.EMPTY, SquareType.EMPTY},
			    {SquareType.RED, SquareType.BLACK, SquareType.BLACK, SquareType.RED, SquareType.EMPTY},
			    {SquareType.RED, SquareType.BLACK, SquareType.BLACK, SquareType.RED, SquareType.EMPTY},
			    {SquareType.EMPTY, SquareType.RED, SquareType.RED, SquareType.EMPTY, SquareType.EMPTY}
		    };
	    return meteor;
	}
    }

    public SquareType[][] powerup2() {
	{
	    SquareType[][] meteor =
		    {{SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY},
			    {SquareType.EMPTY, SquareType.WHITE, SquareType.WHITE, SquareType.EMPTY, SquareType.EMPTY},
			    {SquareType.WHITE, SquareType.BLACK, SquareType.BLACK, SquareType.WHITE, SquareType.EMPTY},
			    {SquareType.WHITE, SquareType.BLACK, SquareType.BLACK, SquareType.WHITE, SquareType.EMPTY},
			    {SquareType.EMPTY, SquareType.WHITE, SquareType.WHITE, SquareType.EMPTY, SquareType.EMPTY}
		    };
	    return meteor;
	}
    }

    public SquareType[][] powerup3() {
	    SquareType[][] meteor =
		    {{SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY},
			    {SquareType.EMPTY, SquareType.GREEN, SquareType.GREEN, SquareType.EMPTY, SquareType.EMPTY},
			    {SquareType.GREEN, SquareType.BLACK, SquareType.BLACK, SquareType.GREEN, SquareType.EMPTY},
			    {SquareType.GREEN, SquareType.BLACK, SquareType.BLACK, SquareType.GREEN, SquareType.EMPTY},
			    {SquareType.EMPTY, SquareType.GREEN, SquareType.GREEN, SquareType.EMPTY, SquareType.EMPTY}
		    };
	    return meteor;
	}
}
