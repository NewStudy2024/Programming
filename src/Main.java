import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Earthquake Categorization
        /*EarthquakeCategorization earthquakeCategorization = new EarthquakeCategorization();
        earthquakeCategorization.method();

        //Ternary operator
        boolean bool = true;
        String result = (bool ? "This boolean is true" : "This boolean is false");
        System.out.println(result);

        //Ticket calculator
        ticketCalculator();*/

        rockPaperScissors();

    }

    public static int calculateDiscountedPrice(int discount, int price){
        return Math.round(price * (1-(discount/100)));
    }

    public static void ticketCalculator(){
        /*Write a program that calculates ticket prices for a theme park based on age and whether the visitor is a student or senior. Student must be under the age of 30 to be a student.*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        Random random = new Random();
        System.out.println("Please show your student ID ");
        boolean isStudent = random.nextBoolean();

        int finalPrice;
        int price = 100;

        if(age < 10){
            System.out.println("Yor are quite young. You will fall out of one of the chairs, and may never get older, but you are free to enter.");
        } else if( age >= 10 && age < 30 && isStudent){
            finalPrice = calculateDiscountedPrice(30, price);
            System.out.println("Your ticket is "+ finalPrice + "Euros" );
        }else if( age >= 30 && isStudent){
            finalPrice = calculateDiscountedPrice(30, price);
            System.out.println("Your ticket is "+ finalPrice + "Euros" );
        }
        scanner.close();

    }

    public static void rockPaperScissors(){
        Scanner scanner = new Scanner(System.in);

        String[] choices = {"rock", "paper", "scissors"};
        int compWin;
        int playerWin;
        boolean wantExit = false;


        String playersChoice = scanner.nextLine();
        playersChoice = playersChoice.toLowerCase();



           System.out.println("-----------------------");
           System.out.println("Welcome to Rock Paper Scissors!)");
           System.out.println("Please enter your choice:  / Rock / Paper / Scissors / Exit): ");
           playersChoice = scanner.nextLine();

           int compChoice = getCompMove();
           int playerChoice = getPlayerMove(playersChoice);

           getDecision(compChoice, playerChoice);




    }

    public static int getCompMove(){
        Random random = new Random();
        int move = random.nextInt(3)+1;
        return move;
    }

    public static int getPlayerMove(String playerChoice){
        int move;
        switch(playerChoice) {
            case "rock":
                return move = 1; //rock
            case "paper":
                return move = 2; //paper
            default:
                return move = 3; //scissors
        }
    }

    public static void getDecision (int compMove, int playerMove){

        switch(compMove) {
            case 1: //rock
                if(playerMove == 1){
                    System.out.println("It's a tie!");
                }else if(playerMove == 2){
                    System.out.println("You won!");
                }else if(playerMove == 3){
                    System.out.println("Computer won!");
                }
            case 2: //paper
                if(playerMove == 1){
                    System.out.println("Computer won!");
                }else if(playerMove == 2){
                    System.out.println("It's a tie!");
                }else if(playerMove == 3){
                    System.out.println("You won!");
                }
            default: //scissors
                if(playerMove == 1){
                    System.out.println("You won!");
                }else if(playerMove == 2){
                    System.out.println("Computer won!");
                }else if(playerMove == 3){
                    System.out.println("It's a tie!");
                }
        }

    }

    public static void getResult (String choice, int player){

    }



}