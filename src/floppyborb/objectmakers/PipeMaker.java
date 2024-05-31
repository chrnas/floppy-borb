package floppyborb.objectmakers;

import floppyborb.enums.SquareType;

/**
 * Creates SquareType[][] for Pipe Class
 */
public class PipeMaker
{
    public SquareType[][] makePipe() {
	SquareType[][] pipe = new SquareType[50][50];
	    for (int x = 0; x < pipe.length; x++) {
		for (int y = 0; y <pipe.length; y++) {
		    pipe[y][x] = SquareType.EMPTY;
		}
	    }
	    for (int x = 0; x < 20; x++) {
		for (int y = 0; y < 50; y++) {
		    pipe[y][x] = SquareType.GREEN;
		}
	    }
	    return pipe;
    }
}
