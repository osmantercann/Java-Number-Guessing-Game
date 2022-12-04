import javax.swing.*; // Gui library
import java.util.Random; // Random library

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(101); // Create a random number
        System.out.println(randomNumber);
        boolean isGameOn = true; //

        while (isGameOn){ // Game loop
            int guess = Integer.parseInt(JOptionPane.showInputDialog("(0-100) Enter your guess:")); // Player's Guess
            if(guess > randomNumber){ // If player's guess is bigger than random number
                JOptionPane.showMessageDialog(null, "Guess lower");
                System.out.println("Guess lower");
            } else if (guess < randomNumber) { // If player's guess is lower than random number
                JOptionPane.showMessageDialog(null, "Guess bigger");
                System.out.println("Guess bigger");
            } else{ // If player's guess is equal random number
                JOptionPane.showMessageDialog(null, "You won!");
                System.out.println("You won!");
                isGameOn = false; // Finish the game
            }
        }
    }
}