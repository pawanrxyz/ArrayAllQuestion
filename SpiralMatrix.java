import java.util.Scanner;

public class SpiralMatrix {
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void printSpiralOrder(int[][] matrix, int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftcol = 0, rightcol = c - 1;
        int totalElements = 0;

        while (totalElements < r * c) {

            // topRow->to leftcol to rigth

            for (int j = leftcol; j <= rightcol - 1 && totalElements < r * c; j++) {
                System.out.print(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++;

            // rightcol->t0 bottomRow
            for (int i = topRow; i <= bottomRow && totalElements < r * c; i++) {
                System.out.print(matrix[i][rightcol]+" ");
                totalElements++;
            }
            rightcol--;
            // bottom to rigthcol to leftcol
            for(int j=rightcol;j>=leftcol && totalElements<r*c;j++) {
                System.out.print(matrix[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;

            // leftcol-bottomRow to topp row
            for (int i = bottomRow; i >= topRow && totalElements < r * c; i--) {
                System.out.print(matrix[i][leftcol] + " ");
                totalElements++;
            }
            leftcol++;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr size of row ");
        int r = sc.nextInt();
        System.out.println("Enter size of coloumn : ");
        int c = sc.nextInt();
        System.out.println("Enter size of an array : ");
        int[][] matrix = new int[r][c];
        int total = r * c;

        System.out.println("Enter " + total + " elements of an matrix ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix Spiral Order ");

        // printMatrix(matrix);
        printSpiralOrder(matrix, r, c);
    }

}
