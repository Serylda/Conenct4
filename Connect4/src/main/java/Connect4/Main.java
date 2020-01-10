
package Connect4;

import java.util.Scanner;


public class Main {
    
    int rows = 6;
    int columns = 7;
    int[][][] array;
    
    final int STATE = 0; //state is index of 3rd array. 0 = empty, 1 = blue, 2 = red
    final int CHECKED = 1; //checked is index of 3rd array. 0 = not checked, 1 = checked
    final int maxRow = 5;
    final int maxColumn = 6;
    
    public Main(){
        array = new int[rows][columns][2];
    }
            
    public static void main(String[] args)
    {
        Main m = new Main();
        boolean userChoice = true;
        Scanner scan = new Scanner(System.in);
        String input = "";
        do{
            
            System.out.println("Continue? (Y/N)");
            input = scan.next();
            if (input == "Y")
                userChoice = true;
            else 
                userChoice = false;
        }while (userChoice);
    }
    
    
    public void printArray(){
        
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(array[i][j][STATE] + " ");
            }
            System.out.println();
        }
    }
    
    public void dropDisc(int column, String color){
        int col = column - 1;
        int row = maxRow;
        for(row = maxRow; row >= 0; row--)
        {
            if (array[row][col][STATE] == 0)
            {
                if (color == "blue"){
                    array[row][column][STATE] = 1;
                }
                else {
                    array[row][column][STATE] = 2;
                }
                break;
            }
        } 
    }
}

