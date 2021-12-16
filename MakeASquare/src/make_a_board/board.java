package make_a_board;
public class board {

    private int[][] grid;
    private int sizeX;
    private int sizeY;

    public board(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        grid = new int[this.sizeX][this.sizeY];
        for (int row = 0; row < sizeX; row++)
        {
            for (int column = 0; column < sizeY; column++)
            {
                grid[row][column] = 0;
            }
        }
    }
    //check is board valid
    public boolean isValidBoard() {
        for (int row = 0; row < sizeX; row++)
        {
            for (int column = 0; column < sizeY; column++)
            {
                if (grid[row][column] == 0)
                {
                    return false;
                }
            }
        }

        return true;
    }

    public int[][] getGrid() {
        return grid;
    }

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }

    //setter
    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }
    //getter
    public int getSizeY() {
        return sizeY;
    }

    public int getSizeX() {
        return sizeX;
    }
    //check win

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int row = 0; row < sizeX; row++)
        {
            str.append("[");
            for (int column = 0; column < sizeY; column++)
            {
                str.append(grid[row][column]);
                if (column != sizeY - 1)
                {
                    str.append(", ");
                }
            }
            str.append("]\n");
        }
        return str.toString();
    }

}