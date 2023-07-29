import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class CatchTheBallGame extends JFrame implements ActionListener, KeyListener {
    private static final int PADDLE_WIDTH = 80;
    private static final int PADDLE_HEIGHT = 30;
    private static final int BALL_SIZE = 20;
    private static final int BALL_SPEED = 3;
    private static final int BALL_DELAY = 10;
    private static final int MAX_MISS_COUNT = 3;

    private JPanel gamePanel;
    private Timer timer;
    private int paddleX;
    private int ballX, ballY;
    private int ballSpeedX, ballSpeedY;
    private int missCount;

    public CatchTheBallGame() {
        setTitle("Catch the Ball");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        gamePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                draw(g);
            }
        };
        gamePanel.setBackground(Color.WHITE);
        add(gamePanel);

        paddleX = (400 - PADDLE_WIDTH) / 2;
        ballX = 400 / 2;
        ballY = BALL_SIZE;

        ballSpeedX = BALL_SPEED;
        ballSpeedY = BALL_SPEED;

        missCount = 0;

        timer = new Timer(BALL_DELAY, this);
        timer.start();

        addKeyListener(this);
        setFocusable(true);
    }

    private void draw(Graphics g) {
        // Draw paddle
        g.setColor(Color.BLUE);
        g.fillRect(paddleX, 600 - PADDLE_HEIGHT - 10, PADDLE_WIDTH, PADDLE_HEIGHT);

        // Draw ball
        g.setColor(Color.RED);
        g.fillOval(ballX, ballY, BALL_SIZE, BALL_SIZE);

        // Draw miss count
        g.setColor(Color.BLACK);
        g.drawString("Miss: " + missCount, 10, 20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Move ball
        ballX += ballSpeedX;
        ballY += ballSpeedY;

        // Check collision with walls
        if (ballX <= 0 || ballX + BALL_SIZE >= 400) {
            ballSpeedX = -ballSpeedX;
        }

        // Check collision with paddle
        if (ballY + BALL_SIZE >= 600 - PADDLE_HEIGHT - 10 &&
                ballX + BALL_SIZE >= paddleX && ballX <= paddleX + PADDLE_WIDTH) {
            ballSpeedY = -ballSpeedY;
        }

        // Check if ball is missed
        if (ballY + BALL_SIZE >= 600) {
            missCount++;
            if (missCount != 0) {
                timer.stop();
                JOptionPane.showMessageDialog(this, "You won the game");
                System.exit(0);
            } else if (missCount == MAX_MISS_COUNT) {
                endGame();
            } else {
                resetBall();
            }
        }

        // Repaint the panel
        gamePanel.repaint();
    }

    private void resetBall() {
        ballX = new Random().nextInt(400 - BALL_SIZE);
        ballY = BALL_SIZE;
        ballSpeedX = BALL_SPEED * (new Random().nextBoolean() ? 1 : -1);
        ballSpeedY = BALL_SPEED;
    }

    private void endGame() {
        timer.stop();
        JOptionPane.showMessageDialog(this, "Game Over! You missed " + missCount + " balls.");
        System.exit(0);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            paddleX = Math.max(0, paddleX - BALL_SPEED * 2);
        } else if (key == KeyEvent.VK_RIGHT) {
            paddleX = Math.min(400 - PADDLE_WIDTH, paddleX + BALL_SPEED * 2);
        }

        // Repaint the panel
        gamePanel.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Do nothing
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Do nothing
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CatchTheBallGame().setVisible(true));
    }
}
