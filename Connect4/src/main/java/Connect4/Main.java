
package Connect4;

import java.util.Scanner;


public class Main {
    
    final int rows = 6;
    final int columns = 7;
    int[][][] array;
    
    final int STATE = 0; //state is index of 3rd array. 0 = empty, 1 = blue, 2 = red
    final int CHECKED = 1; //checked is index of 3rd array. 0 = not checked, 1 = checked
    final int maxRow = 5;
    final int maxColumn = 6;
    
    public int blueTurnCount; //counts turns of player 1
    public int redTurnCount; //counts turns of player 2
    
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
            m.dropDisc(columnBlue, "blue");
            m.printArrayState();
            
            System.out.println("Player 2(Red): Pick number from 1 - 7");
            columnRed = scan.nextInt();
            m.dropDisc(columnRed, "red");
            m.printArrayState();
            
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
                System.out.print(array[i][j][CHECKED] + " ");
            }
            System.out.println();
        }
    }
    
    public void dropDisc(int column, String color){
        int col = column - 1;
        int row = maxRow;
        for(row = maxRow; row >= 0; row--)
        {
            if (col < 0 || col > maxColumn){
                System.out.println("\nYour column value is out of range. Please choose a column value from 1-7\n");
                break;
            }
            else if (array[0][col][STATE] == 1 || array[0][col][STATE] == 2){
                System.out.println("\nColumn is already full. Choose another column.\n");
                break;
            }
            else if (array[row][col][STATE] == 0)
            {
                if (color == "blue"){
                    array[row][col][STATE] = 1;
                    blueTurnCount++;
                    checkWin(row, col, color);
                }
                else {
                    array[row][col][STATE] = 2;
                    redTurnCount++;
                    checkWin(row, col, color);
                }
                break;
            }
        } 
    }
    
    public boolean inRange(int row, int column){
        return (row >= 0 && row <= maxRow) && (column >= 0 && column <= maxColumn);
    }

    private void checkWin(int row, int col, String color) {
        
    }
    
    
    
}

        