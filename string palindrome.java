import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String originalString = input.nextLine();
        String reversedString = "";
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }
        if (originalString.equals(reversedString)) {
            System.out.println( originalString + " palindrome string.");
        } 
        else 
        {
            System.out.println( originalString + " not a palindrome string.");
        }
    }
}
