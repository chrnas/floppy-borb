package floppyborb.objectmakers;

import floppyborb.enums.MovePatternType;

import java.util.ArrayList;
import java.util.List;

/**
 * Creates and returns different movement patterns for the obstacles using the different elements from the MovePatternType enum class.
 */

public class ObstacleMovePatternMaker
{
    public List<MovePatternType> makeMovePattern(int type) {
	List<MovePatternType> movepatternlist;
	switch (type) {
	    case 0:
		movepatternlist = movepattern0();
		return movepatternlist;
	    case 1:
		movepatternlist = movepattern1();
		return movepatternlist;
	    case 2:
		movepatternlist = movepattern2();
		return movepatternlist;
	    case 3:
		movepatternlist = movepattern3();
		return movepatternlist;
	    case 4:
		movepatternlist = movepattern4();
		return movepatternlist;
	    case 5:
		movepatternlist = movepattern5();
		return movepatternlist;
	    default:
		return null;
	}
    }

    public List<MovePatternType> movepattern0() {
	List<MovePatternType> movepattern = new ArrayList<>();
	for (int i = 0; i < 300; i++) {
	    movepattern.add(MovePatternType.LEFT);
	}
	return movepattern;
    }

    public List<MovePatternType> movepattern1() {
	List<MovePatternType> movepatterns1 = new ArrayList<>();
	for (int i = 0; i < 50; i++) {
	    movepatterns1.add(MovePatternType.LEFT);
	    movepatterns1.add(MovePatternType.LEFT);
	    movepatterns1.add(MovePatternType.LEFT);
	    movepatterns1.add(MovePatternType.LEFT);
	    movepatterns1.add(MovePatternType.LEFT);
	    movepatterns1.add(MovePatternType.DOWN);

	}

	return movepatterns1;
    }

    public List<MovePatternType> movepattern2() {
	List<MovePatternType> movepatterns = new ArrayList<>();
	for (int i = 0; i < 50; i++) {
	    movepatterns.add(MovePatternType.LEFT);
	    movepatterns.add(MovePatternType.UP);
	    movepatterns.add(MovePatternType.LEFT);
	    movepatterns.add(MovePatternType.LEFT);
	    movepatterns.add(MovePatternType.LEFT);
	    movepatterns.add(MovePatternType.LEFT);
	    movepatterns.add(MovePatternType.UP);
	}

	return movepatterns;
    }

    public List<MovePatternType> movepattern3() {
	List<MovePatternType> movepatterns = new ArrayList<>();
	for (int i = 0; i < 100; i++) {
	    movepatterns.add(MovePatternType.LEFT);
	    movepatterns.add(MovePatternType.LEFT);
	    movepatterns.add(MovePatternType.LEFT);
	    movepatterns.add(MovePatternType.LEFT);
	    movepatterns.add(MovePatternType.LEFT);
	    movepatterns.add(MovePatternType.RIGHT);
	    movepatterns.add(MovePatternType.RIGHT);}
	    movepatterns.add(MovePatternType.UP);
	    movepatterns.add(MovePatternType.UP);
	    movepatterns.add(MovePatternType.DOWN);
	    movepatterns.add(MovePatternType.DOWN);

	return movepatterns;
    }

    public List<MovePatternType> movepattern4() {
	List<MovePatternType> movepatterns = new ArrayList<>();
	for (int a = 0; a < 200; a++) {
	    for (int b = 0; b < 5; b++) {
		movepatterns.add(MovePatternType.LEFT);
	    }
	    for (int c = 0; c < 3; c++) {
		movepatterns.add(MovePatternType.DOWN);
	    }
	    for (int e = 0; e < 3; e++) {
		movepatterns.add(MovePatternType.RIGHT);
	    }
	    for (int d = 0; d < 3; d++) {
		movepatterns.add(MovePatternType.UP);
	    }
	    for (int e = 0; e < 5; e++) {
		movepatterns.add(MovePatternType.LEFT);
	    }
	}
	return movepatterns;
    }

    public List<MovePatternType> movepattern5() {
	List<MovePatternType> movepatterns1 = new ArrayList<>();
	for (int i = 0; i < 50; i++) {
	    movepatterns1.add(MovePatternType.LEFT);
	    movepatterns1.add(MovePatternType.LEFT);
	    movepatterns1.add(MovePatternType.DOWN);
	    movepatterns1.add(MovePatternType.DOWN);
	    movepatterns1.add(MovePatternType.LEFT);
	    movepatterns1.add(MovePatternType.LEFT);
	    movepatterns1.add(MovePatternType.UP);
	    movepatterns1.add(MovePatternType.UP);
	    movepatterns1.add(MovePatternType.LEFT);
	    movepatterns1.add(MovePatternType.LEFT);
	}
	return movepatterns1;
    }
}

