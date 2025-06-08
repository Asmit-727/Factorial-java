import java.util.Scanner;

public class Capitalizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        String allUpper = word.toUpperCase();  // CAT
        String firstCapital = word.substring(0, 1).toUpperCase() + word.substring(1);  // Cat

        System.out.println("Original: " + word);
        System.out.println("All Uppercase: " + allUpper);
        System.out.println("First Letter Capital: " + firstCapital);

        scanner.close();
    }
}