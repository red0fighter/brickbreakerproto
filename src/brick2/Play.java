package brick2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Play extends JPanel implements ActionListener{
    private Brick[][] brickArray = new Brick[15][18];
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
    private Brick brick;
    //private Ball ball;
    
    
    public Play() {
        roundNum = 0;
        
        this.setBackground(Color.WHITE);
        this.setLayout(null);
        
        createComponents();
        
        this.add(lives);
        this.add(score);
        this.add(round);

        this.setVisible(true);
    }
    
    public void createComponents() {
        lives = new JLabel("Lives: ");
        score = new JLabel("Score: ");
        round = new JLabel("Round: ");
        
        //lives.setBackground(Color.WHITE);
        lives.setBounds(5, 5, 20, 20);
        //score.setBackground(Color.WHITE);
        score.setBounds(495, 5, 10, 5);
        //round.setBackground(Color.WHITE);
        round.setBounds(985, 5, 10, 5);
        
        t1 = new Timer(50, this);
        
        brick = new Brick();
        //ball = new Ball();
        paddle = new PaddleClass();
    }
    
    public void createArray() {
        for(int i = 0; i < brickArray.length; i++) {
            for(int j = 0; j < brickArray.length + 4; j++) {
                brickArray[i][j].add(brick);
            }
        }

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
