// Import statements
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //printing Hello World
        System.out.println("Hello, World!");

        //Basic for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello, World!");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        String[][] matrix = new String[rows][columns];

        for(int i = 0; i< rows; i++){
            for(int j = 0; j< columns; j++){
                matrix[i][j] = "*";
            }
        }

        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("");

        for(int i = 0; i< 3; i++){
           for(int j = 0; j<= i; j++){
            System.out.print("*");
           }
           System.err.println();
        }

        System.out.print("Enter the height of the tree: ");
        int height = scanner.nextInt();        

        for(int i = 0; i< height-1; i++){
            for(int j = 0; j< height - i -1; j++){
                System.err.print(" ");
            }
            for(int j = 0; j< 2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
         }
         
         for(int i = 0; i<2; i++){
            for(int j = 0; j< height -1; j++){
                System.err.print(" ");
            }
            System.out.println("*");
         }



         scanner.close();
 








    }
}
