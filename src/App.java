// Import statements
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        diamond();
        Scanner scanner = new Scanner(System.in);
       
        scanner.close();

    }

    public static void greetingAggressively(){
         //printing Hello World
         System.out.println("Hello, World!");

         //Basic for loop
         for (int i = 1; i <= 5; i++) {
             System.out.println("Hello, World!");
         }
    }

    public static void square(Scanner scanner){
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
    }

    public static void triangle() {
        for(int i = 0; i< 3; i++){
            for(int j = 0; j<= i; j++){
             System.out.print("*");
            }
            System.err.println();
         }
    }

    public static void diamond() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n-i) ; j++) {
                System.out.print("*");
            }

            for (int j = 0; j <= 2*i ; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (n-i) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

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

    public static void christmasTree(Scanner scanner) {
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
    }

        
            
           
        
    

    
}

