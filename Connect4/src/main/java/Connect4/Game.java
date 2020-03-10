
package Connect4;

import java.util.Arrays;
import java.util.Scanner;


public class Game {
    
    final int rows = 6;
    final int columns = 7;
    int[][][] array;
    
    public final int STATE = 0; //state is index of 3rd array. 0 = empty, 1 = blue, 2 = red
    static final int CHECK = 1; //checked is index of 3rd array. 0 = not checked, 1 = checked
    
    public final int EMPTY = 0;
    public final int BLUE = 1;
    public final int RED = 2;

    public final int NOT_CHECKED = 0;
    public final int CHECKED = 1;

    
    public final int maxRow = 5;
    public final int maxColumn = 6;
    
    public int blueTurnCount; //counts turns of player 1
    public int redTurnCount; //counts turns of player 2
    
    int counter = 0;
    
    public Game(){
        array = new int[rows][columns][2];
        blueTurnCount = 0;
        redTurnCount = 0;
    }
    /*        
    public static void main(String[] args)
    {
        Game m = new Game();
        boolean userChoice = true;
        Scanner scan = new Scanner(System.in);
        String input = "";
        int columnBlue = 0;
        int columnRed = 0;
        boolean gameContinue = false;
        do{
            System.out.println("Player 1(Blue): Pick number from 1 - 7");
            columnBlue = scan.nextInt();
            gameContinue = m.dropDisc(columnBlue, BLUE);
            m.printArrayState();
            System.out.println("\n");
            if (gameContinue) break;
            
            System.out.println("Player 2(Red): Pick number from 1 - 7");
            columnRed = scan.nextInt();
            gameContinue = m.dropDisc(columnRed, RED);
            m.printArrayState();
            System.out.println("\n");

            
            System.out.println("\n\n");
            
        }while (!gameContinue);
    }*/
    
    
    public void printArrayState(){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(array[i][j][STATE] + " ");
            }
            System.out.println();
        }
    }
    
    public void printArrayChecked(){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(array[i][j][CHECK] + " ");
            }
            System.out.println();
        }
    }
    
    public boolean dropDisc(int column, int color){
        int col = column - 1;
        int row = maxRow;
        for(row = maxRow; row >= 0; row--)
        {
            if (col < 0 || col > maxColumn){
                System.out.println("\nYour column value is out of range. Please choose a column value from 1-7\n");
                break;
            }
            else if (array[0][col][STATE] == BLUE || array[0][col][STATE] == RED){
                System.out.println("\nColumn is already full. Choose another column.\n");
                break;
            }
            else if (array[row][col][STATE] == EMPTY)
            {
                if (color == BLUE){
                    array[row][col][STATE] = BLUE;
                    blueTurnCount++;
                    return checkWin(row, col, BLUE);
                }
                else {
                    array[row][col][STATE] = RED;
                    redTurnCount++;
                    return checkWin(row, col, RED);
                }
            }
        } 
        return false;
    }
    
    
    public boolean inRange(int row, int column){
        return (row >= 0 && row <= maxRow) && (column >= 0 && column <= maxColumn);
    }

    private boolean checkWin(int r, int c, int color) 
    {
        if (checkWinRow(r, c, color)){
            System.out.println("player " + color + " won. Row");
            return true;
        }
        else if (checkWinCol(r, c, color)){
            System.out.println("player " + color + " won. Column");
            return true;
        }
        else if (checkWinDiagonal(r, c, color)){
            System.out.println("player " + color + " won. Diagonal");
            return true;
        }
        return false;
    }
    
    private boolean checkWinRow(int r, int c, int color)
    {
        int[] arrayRow = new int[7];
        int a = c - 3;
        if (a < 0)
            a = 0;
        int b = c + 3;
        if (b > maxColumn)
            b = maxColumn;
        
        for (int i = a; i <= c; i++){
            arrayRow[i - a] = array[r][i][STATE];
        }
        for (int j = c + 1; j <= b; j++){
            arrayRow[3 + j - c] = array[r][j][STATE];
        }
        
        int counterRow = 0;
        for (int k = 0; k < arrayRow.length; k++){
            if (arrayRow[k] == color)
                counterRow ++;
            else
                counterRow = 0;
            if (counterRow >= 4)
                return true;
        }
       return false;
    }
    
    private boolean checkWinCol(int r, int c, int color)
    {
        if (r > maxRow - 3)
            return false;
        
        for (int i = r, j = 1; i <= maxRow && j <= 4; i++, j++){
            if (array[i][c][STATE] != color)
                return false;
        }
        return true;
        
    }

    private boolean checkWinDiagonal(int r, int c, int color) {
        int[] arrayD = new int[7];
        arrayD[3] = array[r][c][STATE];
        int i, j, k = 0;
        int a, b = 0;
        int d = 2;
        for (i = r+1, j = c+1; k < 3; k++, i++, j++){
            if (inRange(i, j)){
                if (array[i][j][STATE] == color){
                    arrayD[4+k] = color;
                }
            }
            else arrayD[4+k] = 0;
        }
        for (a = r-1, b = c-1; d >= 0; d--, a--, b--){
            if (inRange(a, b)){
                if (array[a][b][STATE] == color){
                    arrayD[d] = color;
                }
            }
            else arrayD[d] = 0;
        }
        
        int counterD = 0;
        boolean diagonal = false;
        for (int x = 0; x < arrayD.length; x++){
            if (arrayD[x] == color)
                counterD++;
            else
                counterD = 0;
            if (counterD >= 4)
                diagonal = true;
            else 
                diagonal = false;
        }
        System.out.println("D - " + Arrays.toString(arrayD));
        
        int[] arrayD2 = new int[7];
        arrayD2[3] = array[r][c][STATE];
        int q, w = 0;
        int e = 2;
        int t, y, u = 0;
        for (q = r+1, w = c-1; e >= 0; e--, q++, w--){
            if (inRange(q, w)){
                if (array[q][w][STATE] == color){
                    arrayD2[e] = color;
                }
            }
            else arrayD2[e] = 0;
        }
        for (t = r-1, y = c+1; u < 3; u++, t--, y++){
            if (inRange(t, y)){
                if (array[t][y][STATE] == color){
                    arrayD2[4+u] = color;
                }
            }
            else arrayD2[4+u] = 0;
        }
        
        int counterD2 = 0;
        boolean diagonal2 = false;
        for (int z = 0; z < arrayD2.length; z++){
            if (arrayD2[z] == color)
                counterD2++;
            else
                counterD2 = 0;
            if (counterD2 >= 4)
                diagonal2 = true;
            else 
                diagonal2 = false;
        }
        System.out.println("D2 - " + Arrays.toString(arrayD2));
        return diagonal || diagonal2;
    }
    
    
  
}

        