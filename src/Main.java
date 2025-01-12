//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        boolean bool = true;
        String result = (bool ? "This boolean is true" : "This boolean is false");
        System.out.println(result);

        /*Write a program that calculates ticket prices for a theme park based on age and whether the visitor is a student or senior. Studentst must be under the age of 30 to be a student.*/

        int age = 40;
        boolean is_student = false;

        if(age<30 && is_student){
            System.out.println("You have a discount ticket price of 20 Euros.");
        } else {
            System.out.println("You have a ticket price of 30 Euros.");
        }


    }

    EarthquakeCategorization earthquakeCategorization = new EarthquakeCategorization();






}