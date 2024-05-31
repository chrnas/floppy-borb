package floppyborb.objectmakers;

import floppyborb.enums.SquareType;

/**
 * Creates SquareType[][] for Bird Class
 */
public class   BirdMaker
{
    public SquareType[][] makeBirdSquares(int type) {
	switch (type) {
	    case 1:
		return bird1();
	    case 2:
		return bird2();
	    case 3:
		return bird3();
	    case 4:
		return bird4();
	    case 5:
		return bird5();
	    default:
		return null;
	}
    }

    public SquareType[][] bird1() {
	SquareType[][] birds1 = {
		{ SquareType.EMPTY, SquareType.BLACK, SquareType.EMPTY, SquareType.BLACK, SquareType.EMPTY },
		{ SquareType.BLACK, SquareType.EMPTY, SquareType.BLACK, SquareType.EMPTY, SquareType.BLACK },
		{ SquareType.BLACK, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.BLACK },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY },};

	return birds1;
    }

    public SquareType[][] bird2() {
	SquareType[][] bird2 = {
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.GREY, SquareType.GREY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.GREY, SquareType.GREY, SquareType.EMPTY, SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.GREY, SquareType.EMPTY, SquareType.EMPTY, SquareType.GREY, SquareType.GREY, SquareType.GREY, SquareType.GREY,SquareType.EMPTY, SquareType.EMPTY, SquareType.GREY, SquareType.EMPTY },
		{ SquareType.GREY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.GREY, SquareType.GREY, SquareType.EMPTY,SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.GREY },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY },
	};

	return bird2;
    }

    public SquareType[][] bird3() {
	SquareType[][] bird3 = {
		{ SquareType.EMPTY, SquareType.BACKGROUND_COLOR, SquareType.BACKGROUND_COLOR, SquareType.BACKGROUND_COLOR, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY, SquareType.EMPTY, SquareType.BACKGROUND_COLOR, SquareType.BACKGROUND_COLOR, SquareType.BACKGROUND_COLOR, SquareType.EMPTY },
		{ SquareType.BACKGROUND_COLOR, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.BACKGROUND_COLOR, SquareType.BACKGROUND_COLOR, SquareType.BACKGROUND_COLOR, SquareType.BACKGROUND_COLOR,SquareType.BACKGROUND_COLOR, SquareType.BACKGROUND_COLOR, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.BACKGROUND_COLOR },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.BACKGROUND_COLOR, SquareType.BACKGROUND_COLOR,SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY },
		{ SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY,SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY },

	};

	return bird3;
    }

    public SquareType[][] bird4() {
	SquareType[][] bird4 = {{SquareType.EMPTY, SquareType.BLACK, SquareType.BLACK, SquareType.EMPTY},
				{SquareType.EMPTY, SquareType.BLACK,SquareType.BLACK,SquareType.EMPTY},
				{SquareType.EMPTY,SquareType.EMPTY,SquareType.EMPTY,SquareType.EMPTY},
				{SquareType.EMPTY,SquareType.EMPTY,SquareType.EMPTY,SquareType.EMPTY}
	};
	return bird4;
    }

    public SquareType[][] bird5() {
	SquareType[][] bird4 = {{SquareType.BLACK, SquareType.BLACK, SquareType.BLACK, SquareType.BLACK},
		{SquareType.BLACK, SquareType.BLACK,SquareType.BLACK,SquareType.BLACK},
		{SquareType.BLACK,SquareType.BLACK,SquareType.BLACK,SquareType.BLACK},
		{SquareType.BLACK,SquareType.BLACK,SquareType.BLACK,SquareType.BLACK}
	};
	return bird4;
    }

}
