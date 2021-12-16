package makeasquare;
import java.util.ArrayList;
import java.util.Collections;
/*
discribe anything you need here.
*/
public class piece {
    private int row , col;
    private char[][] piece;
    public piece(int row , int col , char[][] piece){
        this.row = row;
        this.col = col;
        this.piece = piece;
    }
    public char[][] getPiece(){
        return this.piece.clone();
    }
    
    public char[][] getPieceAfterRotation(int moveID) {
        
        switch(moveID){
            case 0:
                return this.move0();
            case 1:
                return this.move1();

        }
        throw new IndexOutOfBoundsException();
    }
    
    private char[][] move0(){
        //this time I returned a clone not the object reference itself.
        return this.piece.clone();
    }
    private char[][] move1(){
        /*
        it's like rotating it 90 degree clock-wise.
        */
        int id = this.row - 1;
        char[][] newPiece = new char[col][row];
        for(int i = 0; i < this.row; i++){
            for(int j = 0; j < this.col; j++){
                newPiece[j][id] = this.piece[i][j];
            }
            id--;
        }
        return newPiece;
    }
    
    @Override
    public String toString(){
        StringBuffer ret = new StringBuffer();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                ret.append(this.piece[i][j]);
            }
            ret.append('\n');
        }
        return ret.toString();
    }
}
