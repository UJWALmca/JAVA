import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1; // Generates a random number between 0 (inclusive) and 10 (exclusive), then adds 1
        System.out.println("Random number: " + randomNumber);
    }
}
