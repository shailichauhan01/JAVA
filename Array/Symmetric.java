import java.util.Scanner;

public class Symmetric{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the square matrix
        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();
        // Input the elements of the square matrix
        int[][] matrix = new int[size][size];
        System.out.println("Enter the elements of the square matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Check if the matrix is symmetric
        boolean isSymmetric = checkSymmetric(matrix);
        
        // Print the result
        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
        
        scanner.close();
    }
    
    public static boolean checkSymmetric(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        // Check if the matrix is square
        if (rows != cols) {
            return false;
        }
        // Check if the matrix is equal to its transpose
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
