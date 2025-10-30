import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Concatenation
        String concat = str1 + " " + str2;
        System.out.println("Concatenated String: " + concat);

        // Length
        System.out.println("Length of first string: " + str1.length());

        // Comparison
        if (str1.equals(str2))
            System.out.println("Strings are equal.");
        else
            System.out.println("Strings are NOT equal.");

        // Substring
        if (str1.length() >= 3)
            System.out.println("Substring of first string (0–3): " + str1.substring(0, 3));

        // Reverse string
        String reversed = new StringBuilder(str1).reverse().toString();
        System.out.println("Reversed first string: " + reversed);
    }
}
