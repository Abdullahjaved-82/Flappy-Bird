import javax.swing.*; // Importing the Swing library for GUI components

public class App {
    public static void main(String[] args) throws Exception {
        // Defining the dimensions of the game window
        int boardWidth = 360;
        int boardHeight = 640;

        // Creating a JFrame window with the title "Flappy Bird"
        JFrame frame = new JFrame("Flappy Bird");

        // Setting the size of the frame according to the defined width and height
        frame.setSize(boardWidth, boardHeight);

        // Centers the frame on the screen
        frame.setLocationRelativeTo(null);

        // Prevents resizing of the window
        frame.setResizable(false);

        // Ensures the application closes when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating an instance of the FlappyBird game (assumed to be another class)
        FlappyBird flappyBird = new FlappyBird();

        // Adding the FlappyBird game panel to the frame
        frame.add(flappyBird);

        // Adjusts the frame size to fit the preferred size of its components
        frame.pack();

        // Requests focus for the game panel to ensure it receives keyboard input
        flappyBird.requestFocus();

        // Making the frame visible
        frame.setVisible(true);
    }
}
