import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Läs in en temperatur i Fahrenheit och omvanda den till Celsius
        // Man kan använda formeln: C = (F-32)*5/9

        Scanner input = new Scanner(System.in);
        System.out.print("Ange en temperatur i Fahrenheit: ");
        double f = input.nextDouble();
        double c = (f-32)*5/9;

        System.out.println("Omvandlat till celsius blir det " + c +  " grader.");
    }
}