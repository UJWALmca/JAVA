import java.util.Random;

public class RandomName {

  public static void main(String[] args) {
    String[] firstNames = {"Alice", "Bob", "Charlie", "David", "Emily"};
    String[] lastNames = {"Smith", "Johnson", Williams", Brown", Jones"};
    
    Random random = new Random();
    
    int firstNameIndex = random.nextInt(firstNames.length);
    int lastNameIndex = random.nextInt(lastNames.length);
    
    String fullName = firstNames[firstNameIndex] + " " + lastNames[lastNameIndex];
    System.out.println("Random name: " + fullName);
  }
}
