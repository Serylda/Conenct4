/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect4;

import java.util.Scanner;

/**
 *
 * @author ericy
 */
public class Main {
    
    int rows = 6;
    int columns = 7;
    int[][][] array;
    
    final int STATE = 0; //state is index of 3rd array. 0 = empty, 1 = red, 2 = blue
    final int CHECKED = 1; //checked is index of 3rd array. 0 = not checked, 1 = checked
    
    public Main(){
        array = new int[rows][columns][2];
    }
            
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("monkey");
        String a = s.next();
        System.out.println(a);
    }
    
    
    public void printArray(){
        
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(array[i][j][STATE] + " ");
            }
            System.out.println();
        }
    }
}

