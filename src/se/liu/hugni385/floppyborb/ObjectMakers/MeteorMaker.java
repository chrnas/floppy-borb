package se.liu.hugni385.floppyborb.ObjectMakers;

import se.liu.hugni385.floppyborb.Enums.SquareType;

/**
 * Creates SquareType[][] for Meteor Class
 */
public class MeteorMaker
{
    public SquareType[][] makeMeteor(int type) {
	switch (type) {
	    case 0:
		return meteor0();
	    case 1:
	    	return meteor1();
	    case 2:
		return meteor2();
	    default:
		return null;
	}
    }

    public SquareType[][] meteor0() {
	{
	    SquareType[][] meteor = {{SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY},
		     		     {SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY},
		    		     {SquareType.EMPTY, SquareType.BLACK, SquareType.BLACK, SquareType.EMPTY, SquareType.EMPTY},
		     		     {SquareType.EMPTY, SquareType.BLACK, SquareType.BLACK, SquareType.EMPTY, SquareType.EMPTY},
		    		     {SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY}
	    };
	    return meteor;
	}
    }

    public SquareType[][] meteor1() {
	{
	    SquareType[][] meteor =
		    {{SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY},
		    {SquareType.EMPTY, SquareType.BLACK, SquareType.BLACK, SquareType.BLACK, SquareType.EMPTY},
		    {SquareType.EMPTY, SquareType.BLACK, SquareType.BLACK, SquareType.BLACK, SquareType.EMPTY},
		    {SquareType.EMPTY, SquareType.BLACK, SquareType.BLACK, SquareType.BLACK, SquareType.EMPTY},
		    {SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY}
	    };
	    return meteor;
	}
    }

    public SquareType[][] meteor2() {
	{
	    SquareType[][] meteor =
		    {{SquareType.BLACK, SquareType.BLACK, SquareType.BLACK, SquareType.BLACK, SquareType.BLACK},
		    {SquareType.BLACK, SquareType.BLACK, SquareType.BLACK, SquareType.BLACK, SquareType.BLACK},
		    {SquareType.BLACK, SquareType.BLACK, SquareType.BLACK, SquareType.BLACK, SquareType.BLACK},
		    {SquareType.BLACK, SquareType.BLACK, SquareType.BLACK, SquareType.BLACK, SquareType.BLACK},
		    {SquareType.BLACK, SquareType.BLACK, SquareType.BLACK, SquareType.BLACK, SquareType.BLACK}
	    };
	    return meteor;
	}
    }
}
