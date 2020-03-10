
package Connect4;

import java.util.Scanner;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author ericy
 */
public class Window extends javax.swing.JFrame {

    Game gGame;
    //Graphics graphic
    int currentColor = 0;
    
    public Window() {
        initComponents();
        
        tabPane.setSelectedIndex(0);
        logo.setIcon(new ImageIcon("logo.png"));
        
        gGame = new Game();
        currentColor = 1;
        //CPanel gridPanel = new CPanel();
        //gridPanel.setGame(gGame);
        
        
        column1.setLocation(0, column1.getY());
        System.out.println(column1.getX());
        
        //column1.setIcon(new ImageIcon("logo.png"));
        /*
        boolean userChoice = true;
        Scanner scan = new Scanner(System.in);
        String input = "";
        int columnBlue = 0;
        int columnRed = 0;
        boolean gameContinue = false;
        do{
            System.out.println("Player 1(Blue): Pick number from 1 - 7");
            columnBlue = scan.nextInt();
            gameContinue = g.dropDisc(columnBlue, BLUE);
            g.printArrayState();
            System.out.println("\n");
            if (gameContinue) break;
            
            System.out.println("Player 2(Red): Pick number from 1 - 7");
            columnRed = scan.nextInt();
            gameContinue = g.dropDisc(columnRed, RED);
            g.printArrayState();
            System.out.println("\n");

            
            System.out.println("\n\n");
        }while (!gameContinue);*/
    }
    
    public void rendorGrid(Graphics g)
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
        g.setColor(Color.DARK_GRAY);
        g.drawRect(distance + col * (sideLength + distance), row * (sideLength + distance), sideLength, sideLength);
        g.setColor(Color.WHITE);
        g.drawRect(distance + 2 + col * (sideLength + distance), 2 + row * (sideLength + distance), sideLength - 4, sideLength - 4); 
        
        if (gGame.array[row][col][gGame.STATE] == gGame.BLUE)
            g.setColor(new Color(51, 153, 255));
        else if (gGame.array[row][col][gGame.STATE] == gGame.RED)
            g.setColor(new Color(255, 51, 51));
        else
            g.setColor(Color.WHITE);
        
        g.fillRect(distance + (sideLength - innerLength)/2 + col * (sideLength + distance),
                (sideLength - innerLength)/2 + row * (sideLength + distance), innerLength, innerLength);
        
        g.setColor(Color.DARK_GRAY);
        g.drawRect(distance + (sideLength - innerLength)/2 + col * (sideLength + distance),
                (sideLength - innerLength)/2 + row * (sideLength + distance), innerLength, innerLength);
        //g.fillRect(distance + col * (sideLength + distance), row * (sideLength + distance), sideLength, sideLength); 
    }
    
    public void alternateColor()
    {
        if (currentColor == 0)
            currentColor = 1; //blue
        else if (currentColor == 1)
            currentColor = 2;
        else
            currentColor = 1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPane = new javax.swing.JTabbedPane();
        login = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        game = new javax.swing.JPanel();
        gridPanel = new CPanel();
        buttonPanel = new javax.swing.JPanel();
        column1 = new javax.swing.JButton();
        column2 = new javax.swing.JButton();
        column3 = new javax.swing.JButton();
        column4 = new javax.swing.JButton();
        column5 = new javax.swing.JButton();
        column6 = new javax.swing.JButton();
        column7 = new javax.swing.JButton();
        stats = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 700));

        logo.setText(" ");

        jLabel1.setText("Username:");

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                .addContainerGap(273, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addGap(221, 221, 221)
                .addComponent(jLabel1)
                .addContainerGap(412, Short.MAX_VALUE))
        );

        tabPane.addTab("Login", login);

        javax.swing.GroupLayout gridPanelLayout = new javax.swing.GroupLayout(gridPanel);
        gridPanel.setLayout(gridPanelLayout);
        gridPanelLayout.setHorizontalGroup(
            gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        gridPanelLayout.setVerticalGroup(
            gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );

        column1.setText("1");
        column1.setMaximumSize(new java.awt.Dimension(60, 25));
        column1.setMinimumSize(new java.awt.Dimension(60, 25));
        column1.setPreferredSize(new java.awt.Dimension(60, 25));
        column1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                column1ActionPerformed(evt);
            }
        });

        column2.setText("2");
        column2.setMaximumSize(new java.awt.Dimension(60, 25));
        column2.setMinimumSize(new java.awt.Dimension(60, 25));
        column2.setPreferredSize(new java.awt.Dimension(60, 25));
        column2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                column2ActionPerformed(evt);
            }
        });

        column3.setText("3");
        column3.setMaximumSize(new java.awt.Dimension(60, 25));
        column3.setMinimumSize(new java.awt.Dimension(60, 25));
        column3.setPreferredSize(new java.awt.Dimension(60, 25));
        column3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                column3ActionPerformed(evt);
            }
        });

        column4.setText("4");
        column4.setMaximumSize(new java.awt.Dimension(60, 25));
        column4.setMinimumSize(new java.awt.Dimension(60, 25));
        column4.setPreferredSize(new java.awt.Dimension(60, 25));
        column4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                column4ActionPerformed(evt);
            }
        });

        column5.setText("5");
        column5.setMaximumSize(new java.awt.Dimension(60, 25));
        column5.setMinimumSize(new java.awt.Dimension(60, 25));
        column5.setPreferredSize(new java.awt.Dimension(60, 25));
        column5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                column5ActionPerformed(evt);
            }
        });

        column6.setText("6");
        column6.setMaximumSize(new java.awt.Dimension(60, 25));
        column6.setMinimumSize(new java.awt.Dimension(60, 25));
        column6.setPreferredSize(new java.awt.Dimension(60, 25));
        column6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                column6ActionPerformed(evt);
            }
        });

        column7.setText("7");
        column7.setMaximumSize(new java.awt.Dimension(60, 25));
        column7.setMinimumSize(new java.awt.Dimension(60, 25));
        column7.setPreferredSize(new java.awt.Dimension(60, 25));
        column7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                column7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(column1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(column2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(column3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(column4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(column5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(column6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(column7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(column1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(column2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(column3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(column4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(column5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(column6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(column7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout gameLayout = new javax.swing.GroupLayout(game);
        game.setLayout(gameLayout);
        gameLayout.setHorizontalGroup(
            gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameLayout.createSequentialGroup()
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gridPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 234, Short.MAX_VALUE))
        );
        gameLayout.setVerticalGroup(
            gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameLayout.createSequentialGroup()
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabPane.addTab("Game", game);

        javax.swing.GroupLayout statsLayout = new javax.swing.GroupLayout(stats);
        stats.setLayout(statsLayout);
        statsLayout.setHorizontalGroup(
            statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 995, Short.MAX_VALUE)
        );
        statsLayout.setVerticalGroup(
            statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
        );

        tabPane.addTab("Stats", stats);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void column1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_column1ActionPerformed
        gGame.dropDisc(1, currentColor);
        alternateColor();
        rendorGrid(gridPanel.getGraphics());
    }//GEN-LAST:event_column1ActionPerformed

    private void column2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_column2ActionPerformed
        gGame.dropDisc(2, currentColor);
        alternateColor();
        rendorGrid(gridPanel.getGraphics());
    }//GEN-LAST:event_column2ActionPerformed

    private void column3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_column3ActionPerformed
        gGame.dropDisc(3, currentColor);
        alternateColor();
        rendorGrid(gridPanel.getGraphics());
    }//GEN-LAST:event_column3ActionPerformed

    private void column4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_column4ActionPerformed
        gGame.dropDisc(4, currentColor);
        alternateColor();
        rendorGrid(gridPanel.getGraphics());
    }//GEN-LAST:event_column4ActionPerformed

    private void column5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_column5ActionPerformed
        gGame.dropDisc(5, currentColor);
        alternateColor();
        rendorGrid(gridPanel.getGraphics());
    }//GEN-LAST:event_column5ActionPerformed

    private void column6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_column6ActionPerformed
        gGame.dropDisc(6, currentColor);
        alternateColor();
        rendorGrid(gridPanel.getGraphics());
    }//GEN-LAST:event_column6ActionPerformed

    private void column7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_column7ActionPerformed
        gGame.dropDisc(7, currentColor);
        alternateColor();
        rendorGrid(gridPanel.getGraphics());
    }//GEN-LAST:event_column7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
        
        //LoginScreen login = new LoginScreen();
        //login.setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton column1;
    private javax.swing.JButton column2;
    private javax.swing.JButton column3;
    private javax.swing.JButton column4;
    private javax.swing.JButton column5;
    private javax.swing.JButton column6;
    private javax.swing.JButton column7;
    private javax.swing.JPanel game;
    private javax.swing.JPanel gridPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel login;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel stats;
    private javax.swing.JTabbedPane tabPane;
    // End of variables declaration//GEN-END:variables
}
