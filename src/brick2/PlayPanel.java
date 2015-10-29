
package brick2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PlayPanel extends JPanel implements ActionListener{
    
    private int roundNum;
    private int x;
    private int y;
    private int width;
    private int height;
    
    private JLabel lives;
    private JLabel score;
    private JLabel round;
    
    private Timer t1;
    
    private PaddleClass paddle;
    //private Brick brick;
    //private Ball ball;
    
    
    public PlayPanel() {
        roundNum = 0;
        
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        
        createComponents();
        
        this.add(lives);
        this.add(score);
        this.add(round);
        this.setVisible(true);
    }
    
    public void createComponents() {
        lives = new JLabel();
        score = new JLabel();
        round = new JLabel();
        
        lives.setBounds(x, y, width, height);
        
        t1 = new Timer(50, this);
        
        //brick = new Brick();
        //ball = new Ball();
        paddle = new PaddleClass();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        brick.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == t1) {
            repaint();
        }
    }
    
    
}
