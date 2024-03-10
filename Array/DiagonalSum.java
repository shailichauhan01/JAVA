import java.util.Scanner;

public class DiagonalSum {
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
        
        // Calculate and print the sum of the primary diagonal
        int primaryDiagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            primaryDiagonalSum+= matrix[i][i];
        }
        System.out.println("Sum of the primary diagonal: " + primaryDiagonalSum);
        
        // Calculate and print the sum of the secondary diagonal
        int secondaryDiagonalSum= 0;
        for (int i = 0; i < matrix.length; i++) {
            secondaryDiagonalSum+= matrix[i][matrix.length - 1 - i];
        }
        System.out.println("Sum of the secondary diagonal: " + secondaryDiagonalSum);
        
        scanner.close();
    }
}
