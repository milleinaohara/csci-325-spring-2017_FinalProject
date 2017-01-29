package csu.csci325;

/**
 * Created by Millerjohneric on 1/27/2017.
 */
public class King extends ChessPiece {
    /**
     * motion:  CANNOT MOVE INTO CHECK
     *          up, down, left, right, diagonal one space only
     */
    boolean mColor;
    public King(){

    }
    public King(boolean color){
        mColor = color;
    }
    public String toString(){
        if (mColor) {
            return "King W       ";
        }
        return     "King B       ";
    }

}
