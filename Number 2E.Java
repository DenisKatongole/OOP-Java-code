import java.util.Scanner;

public class BookSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book description:");
        String input = scanner.nextLine().toLowerCase();
        
        int count = 0;
        String[] words = input.split("\\s+");
        for (String word : words) {
            if (word.equals("uganda")) count++;
        }
        System.out.println("Word 'Uganda' appears " + count + " times.");
    }
}
