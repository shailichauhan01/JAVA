import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for the first matrix
        System.out.println("Enter the elements of the first matrix (3x3):");
        int[][] matrix1= new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        // Input for the second matrix
        System.out.println("Enter the elements of the second matrix (3x3):");
        int[][] matrix2= new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
        // Calculate the sum of matrices
        int[][] sumMatrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        // Output the sum matrix
        System.out.println("Sum of the two matrices:");
       for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
