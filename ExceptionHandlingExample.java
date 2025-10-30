import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();

            System.out.print("Enter denominator: ");
            int b = sc.nextInt();

            int result = a / b; // may throw ArithmeticException
            System.out.println("Result: " + result);

            int[] arr = {1, 2, 3};
            System.out.println("Accessing 5th element: " + arr[4]); // may throw ArrayIndexOutOfBoundsException

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero not allowed!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of range!");
        } catch (Exception e) {
            System.out.println("Some other error occurred: " + e.getMessage());
        } finally {
            System.out.println("Program ended safely.");
        }
    }
}

