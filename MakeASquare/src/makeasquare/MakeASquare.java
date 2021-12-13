package makeasquare;


public class MakeASquare {

    
    public static void main(String[] args) {
        char[][] piece = {{'0' , '1'} , {'2' , '3'}};
        piece trail = new piece(2 , 2 , piece);
        
        char[][] ret = trail.getPieceAfterRotation(1);

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(ret[i][j]);
            }
            System.out.println();
        }

    }
    
}
/*
01
23

20
31

*/