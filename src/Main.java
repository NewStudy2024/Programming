import java.util.Scanner;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EarthquakeCategorization earthquakeCategorization = new EarthquakeCategorization();
        earthquakeCategorization.method();

        boolean bool = true;
        String result = (bool ? "This boolean is true" : "This boolean is false");
        System.out.println(result);



    }

    public static int discountedPrice(int discount, int price){
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

        int discountedPrice;
        int price = 2500;

        if(age< 10){
            System.out.println("Yor are quite young. You will fall out of one of the chairs, and may never get older, but you are free to enter.");
        } else if( age >= 10 && age < 30 && isStudent){
            discountedPrice = discountedPrice(30, price);
            System.out.println("Your ticket is "+ discount + "Euros" );
        }else if( age >= 30 && isStudent){
            discountedPrice = discountedPrice(20, price);
            System.out.println("Your ticket is "+ discount + "Euros" );
        }

    }

}