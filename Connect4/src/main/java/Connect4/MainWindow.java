/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect4;

import java.util.Scanner;

/**
 *
 * @author anant
 */
public class MainWindow {
    
    final int ROWS = 6;
    final int COLUMNS = 7;
    int[][][] array;
    
    public MainWindow(){
        array = new int[ROWS][COLUMNS][2];
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Test");
        String input = keyboard.next();
        System.out.println(input);
    }
    
    public void printArray(){
        
        for (int i = 0; i < ROWS; i++){
            for (int j = 0; j < COLUMNS; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
