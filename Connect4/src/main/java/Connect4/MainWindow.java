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
    
    int rows = 6;
    int columns = 7;
    int[][] array = new int[rows][columns];
    
    public MainWindow(){
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean userChoice = true;
        System.out.println("Do you want to keep playing (Y/N)?"); 
        Scanner scan = new Scanner(System.in);
        System.out.println(scan.nextLine());
        
    }
    
    public void printArray(){
        
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
