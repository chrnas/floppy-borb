package se.liu.hugni385.floppyborb.ObjectMakers;

import se.liu.hugni385.floppyborb.Enums.SquareType;

/**
 * Creates SquareType[][] for Bullet Class
 */
public class BulletMaker
{
    public SquareType[][] makeBulletsSquares(int type) {
	switch (type) {
	    case 0:
		return bullets0();
	    default:
		return null;
	}
    }

    public SquareType[][] bullets0() {
	{
	    SquareType[][] bullet = { { SquareType.BLACK, SquareType.BLACK},
		    			{SquareType.BLACK, SquareType.BLACK} };

	    return bullet;
	}
    }
}
