
package Connect4;

import java.util.Scanner;


public class Main {
    
    final int rows = 6;
    final int columns = 7;
    int[][][] array;
    
    static final int STATE = 0; //state is index of 3rd array. 0 = empty, 1 = blue, 2 = red
    static final int CHECK = 1; //checked is index of 3rd array. 0 = not checked, 1 = checked
    
    static final int EMPTY = 0;
    static final int BLUE = 1;
    static final int RED = 2;

    static final int NOT_CHECKED = 0;
    static final int CHECKED = 1;

    
    static final int maxRow = 5;
    static final int maxColumn = 6;
    
    public int blueTurnCount; //counts turns of player 1
    public int redTurnCount; //counts turns of player 2
    
    int counter = 0;
    
    public Main(){
        array = new int[rows][columns][2];
        blueTurnCount = 0;
        redTurnCount = 0;
    }
            
    public static void main(String[] args)
    {
        Main m = new Main();
        boolean userChoice = true;
        Scanner scan = new Scanner(System.in);
        String input = "";
        int columnBlue = 0;
        int columnRed = 0;
        
        do{
            System.out.println("Player 1(Blue): Pick number from 1 - 7");
            columnBlue = scan.nextInt();
            m.dropDisc(columnBlue, BLUE);
            m.printArrayState();
            m.printArrayChecked();
            
            System.out.println("Player 2(Red): Pick number from 1 - 7");
            columnRed = scan.nextInt();
            m.dropDisc(columnRed, RED);
            m.printArrayState();
            m.printArrayChecked();

            
            System.out.println("Continue? (Y/N)");
            input = scan.next();
            if (input.equals("Y") || input.equals("y"))
                userChoice = true;
            else 
                userChoice = false;
            
            System.out.println("\n\n");
            
        }while (userChoice);
    }
    
    
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
    
    public void dropDisc(int column, int color){
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
                    checkWin(row, col, BLUE);
                }
                else {
                    array[row][col][STATE] = RED;
                    redTurnCount++;
                    checkWin(row, col, RED);
                }
                break;
            }
        } 
    }
    
    public boolean inRange(int row, int column){
        return (row >= 0 && row <= maxRow) && (column >= 0 && column <= maxColumn);
    }

    private void checkWin(int r, int c, int color) 
    {
        if (counter < 4)
        {
            System.out.println(counter);
            if (inRange(r - 1, c) && array[r - 1][c][CHECK] == NOT_CHECKED)
            {
                if (array[r - 1][c][STATE] == color)
                {
                    counter++;
                    checkWin(r - 1, c, color);
                }
                array[r - 1][c][CHECK] = CHECKED;
            }
            else if (inRange(r + 1, c) && array[r + 1][c][CHECK] == NOT_CHECKED)
            {
                if (array[r + 1][c][STATE] == color)
                {
                    counter++;
                    checkWin(r + 1, c, color);
                }
                array[r + 1][c][CHECK] = CHECKED;
            }
            else
            {
                counter = 0;
            }
        }
        else
        {
            System.out.println(color + "won");
        }
    }
    
    
    
}

        