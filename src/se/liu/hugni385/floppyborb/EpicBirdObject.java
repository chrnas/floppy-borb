package se.liu.hugni385.floppyborb;

import se.liu.hugni385.floppyborb.Enums.EpicBirdType;
import se.liu.hugni385.floppyborb.Enums.SquareType;

public interface EpicBirdObject
{
    /**
     * Contains the essential functions for the different objects that are used to, for example, determine coordinates.
     * @return
     */

    public int getPositionX();

    public int getPositionY();

    public int getSquaresLength();

    public EpicBirdType getEpicBirdType();

    public SquareType getSquareType(int x, int y);

    public void moveObject();

    public boolean collisionEvent();

    public boolean checkIfOutOfBounds();

}
