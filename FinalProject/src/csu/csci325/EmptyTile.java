package csu.csci325;

/**
 * Created by Millerjohneric on 1/29/2017.
 */
public class EmptyTile extends ChessPiece{
    /**
     * empty
     */
    public EmptyTile(){

    }

    public int getColor(){
        return -1;
    }
    public String toString(){
            return "             ";
    }
}
