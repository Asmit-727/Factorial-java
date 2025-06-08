public class Capitalizer {
    public static void main(String[] args) {
        String word = "cat";

        String allUpper = word.toUpperCase();  // CAT
        String firstCapital = word.substring(0, 1).toUpperCase() + word.substring(1);  // Cat

        System.out.println("Original: " + word);
        System.out.println("All Uppercase: " + allUpper);
        System.out.println("First Letter Capital: " + firstCapital);
    }
}
