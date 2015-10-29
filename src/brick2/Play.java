/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brick2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.event.KeyEvent;

import java.awt.event.KeyListener;
import javax.swing.*;

/**
 *
 * @author sdt5106
 */
public class Play extends JPanel implements KeyListener {

    PaddleClass paddle;
    Graphics g;
    static int stageno, scoreno, livesno;

    JLabel stage, score, lives;

    Play() {
        super();
        setFocusable(true);
        
        setLayout(null);
        init();
    }

    void init() {
        stageno = 1;
        scoreno = 0;
        livesno = 3;

        stage = new JLabel("Stage #: " + stageno);
        score = new JLabel("Score: " + scoreno);
        lives = new JLabel("Lives: " + livesno);

        add(stage);
        add(score);
        add(lives);

        stage.setBounds(5, 5, 100, 25);
        score.setBounds(115, 5, 100, 25);
        lives.setBounds(225, 5, 100, 25);

        paddle = new PaddleClass();

        addKeyListener(this);

    }

    void updatescore() {
        scoreno += 10;
        score.setText("Score: " + scoreno);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        requestFocusInWindow();
        g.fillRect(paddle.xPos, paddle.Y_POS, paddle.PADDLE_WIDTH, paddle.PADDLE_HEIGHT);
        g.setColor(Color.pink);
        g.drawRect(paddle.xPos, paddle.Y_POS, paddle.PADDLE_WIDTH, paddle.PADDLE_HEIGHT);
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int x = ke.getKeyCode();
        if (x == KeyEvent.VK_LEFT) {
           
            int temp = paddle.getxpos();
            System.out.println("temp:" + temp);
            if (temp > 0) {
                 System.out.println("test");
                paddle.setxpos(-25);
                revalidate();
                repaint();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }
}
