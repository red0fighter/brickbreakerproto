package brick2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class Play extends JPanel implements ActionListener, KeyListener {

    JButton button = new JButton("Click Me");

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

        this.setBackground(Color.BLACK);
        this.setLayout(null);

        createComponents();

        this.add(lives);
        this.add(score);
        this.add(round);
        this.add(button);
        this.setVisible(true);
    }

    public void createComponents() {
        lives = new JLabel();
        score = new JLabel();
        round = new JLabel();

        button.setBounds(0, 1000, 75, 50);
        button.addActionListener(this);

        lives.setBounds(x, y, width, height);

        t1 = new Timer(50, this);

        brick = new Brick();
        //ball = new Ball();
        paddle = new PaddleClass();
        setFocusable(true);
        addKeyListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        requestFocusInWindow();
        g.fillRect(paddle.xPos, paddle.Y_POS, paddle.PADDLE_WIDTH, paddle.PADDLE_HEIGHT);
        g.setColor(Color.pink);
        g.drawRect(paddle.xPos, paddle.Y_POS, paddle.PADDLE_WIDTH, paddle.PADDLE_HEIGHT);
        brick.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == t1) {
            repaint();
        }

        if (e.getSource() == button) {
            t1.start();
        }

    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int x = ke.getKeyCode();
        if (x == KeyEvent.VK_LEFT) {
            if (paddle.getxpos() > 0) {
                paddle.setxpos(-10);
                repaint();

            }
        }

        if (x == KeyEvent.VK_RIGHT) {
            if (paddle.getxpos() < 750) {
                paddle.setxpos(10);
                repaint();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

}
