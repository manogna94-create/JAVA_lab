import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix (rows and cols): ");
        int n = sc.nextInt();

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] sum = new int[n][n];
        int[][] product = new int[n][n];

        System.out.println("Enter matrix A:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter matrix B:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                B[i][j] = sc.nextInt();

        // Addition
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                sum[i][j] = A[i][j] + B[i][j];

        // Multiplication
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    product[i][j] += A[i][k] * B[k][j];

        System.out.println("Matrix Addition:");
        printMatrix(sum);
        System.out.println("Matrix Multiplication:");
        printMatrix(product);
    }

    static void printMatrix(int[][] M) {
        for (int[] row : M) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
