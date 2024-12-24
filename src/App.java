// Import statements
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        diamond();
        scanner.close();

    }

    public static void greetingAggressively(){
         // Printing Hello World
         System.out.println("Hello, World!");

         // Printing Hello World 5 times
         for (int i = 1; i <= 5; i++) {
             System.out.println("Hello, World!");
         }
    }
    // Method to print a rectangle based on user input
    public static void square(Scanner scanner){
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        String[][] matrix = new String[rows][columns];
        // Filling matrix
        for(int i = 0; i< rows; i++){
            for(int j = 0; j< columns; j++){
                matrix[i][j] = "*";
            }
        }
        // Printing
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    // Method to print a simple triangle of stars
    public static void triangle() {
        for(int i = 0; i< 3; i++){
            for(int j = 0; j<= i; j++){
             System.out.print("*");
            }
            System.err.println();
         }
    }
      // Method to print a diamond pattern of stars
    public static void diamond() {
        int n = 5; //size of diamond

        // Top half of the diamond
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n-i) ; j++) {
                System.out.print("*");
            }

            for (int j = 0; j <= 2*i ; j++) {
                System.out.print(" "); // Print spaces
            }

            for (int j = 0; j < (n-i) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower half of the diamond
        for (int i = 1; i <= n; i++) {
           
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j <= 2*(n-i) ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
     // Method to print a Christmas tree based on user input
    public static void christmasTree(Scanner scanner) {
        System.out.print("Enter the height of the tree: "); // Get height of the tree
        int height = scanner.nextInt();        

         // Print the tree
        for(int i = 0; i< height-1; i++){
            for(int j = 0; j< height - i -1; j++){
                System.err.print(" "); // Print spaces
            }
            for(int j = 0; j< 2*i+1; j++){
                System.out.print("*"); // Print stars
            }
            System.out.println();
         }
         // Print the tree trunk
         for(int i = 0; i<2; i++){
            for(int j = 0; j< height -1; j++){
                System.err.print(" ");
            }
            System.out.println("*");
         }
    }
     // Method to print a matrix
   public static void printMatrix(int [][] matrix ){
        
        for (int row = 0; row<matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("[%d] ", matrix[row][col]);
            }
            System.err.println("");
        }
    
   }
   // Method to add two matrices
   public static void matrixAddition() {
        int [][] matrix1 = {
            {1, 2,},
            {3, 4,}
        };

        int [][] matrix2 = {
            {1, 1,},
            {1, 1,}
        };

        int[][] matrix3 = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length ; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        printMatrix(matrix3);
   }
    // Method to multiply two matrices
    public static void matrixMultiplication() {
        //2x3
        int [][] matrix1 = {
            {2, 4},
            {3, 4}
        };
        //3x2
        int [][] matrix2 = {
            {1, 2,},
            {1, 3,},
        };
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int col2 = matrix2[0].length;

        //2x2
        int [][] matrix3 = new int[row1][col2];

        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[0].length; j++) {
                for (int k = 0; k < col1; k++) {
                    matrix3[i][j] += matrix1[i][k]*matrix2[k][j];
                }
            }
        }

        printMatrix(matrix3);
    }
     // Transpose the matrix
    public static void matrixTranspose() {
        int [][] matrix1 = {
            {1, 1, 1, 1},
            {2, 2, 2, 2},
            {3, 3, 3, 3},
            {4, 4, 4, 4}
        };

        int [][] matrix2 = new int[matrix1.length][matrix1[0].length];
        
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrix2[i][j] = matrix1[j][i];
            }
        }
        printMatrix(matrix2);
    }
           
        
    

    
}

