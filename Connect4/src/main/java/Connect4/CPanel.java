/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect4;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author ericy
 */
public class CPanel extends JPanel {
    
    public Game game;
    
    public CPanel()
    {
        game = new Game();
    }
    
    
    public void setGame(Game g)
    {
        game = g;
    }
    
    
    @Override
    public void paintComponent(Graphics g)
    {
        for (int r = 0; r < 6; r++)
            for (int c = 0; c < 7; c++)
                drawR(c, r, g);
        //g.drawRect(0, 0, 10, 10);
    }
    
    public void drawR(int col, int row, Graphics g)
    {
        int sideLength = 60;
        int innerLength = 40;
        int distance = 30;
        
        g.setColor(Color.GRAY);
        g.fillRect(distance + col * (sideLength + distance), row * (sideLength + distance), sideLength, sideLength); 
        g.setColor(Color.WHITE);
        g.drawRect(distance + col * (sideLength + distance), row * (sideLength + distance), sideLength, sideLength); 
        
        if (game.array[row][col][game.STATE] == game.BLUE)
            g.setColor(Color.BLUE);
        else if (game.array[row][col][game.STATE] == game.RED)
            g.setColor(Color.RED);
        else
            g.setColor(Color.WHITE);
        
        g.fillRect(distance + (sideLength - innerLength)/2 + col * (sideLength + distance),
                (sideLength - innerLength)/2 + row * (sideLength + distance), innerLength, innerLength);
        
        g.setColor(Color.DARK_GRAY);
        g.drawRect(distance + (sideLength - innerLength)/2 + col * (sideLength + distance),
                (sideLength - innerLength)/2 + row * (sideLength + distance), innerLength, innerLength);
        //g.fillRect(distance + col * (sideLength + distance), row * (sideLength + distance), sideLength, sideLength); 
    }
}
