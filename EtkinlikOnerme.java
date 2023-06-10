import java.sql.SQLOutput;
import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {

        double Temp;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a temperature value: ");
        Temp = input.nextDouble();

        if (Temp <= 5) {
            System.out.println("You can go skiing.");
        } else if (5 < Temp && Temp <= 15) {
            System.out.println("You can go to the cinema.");
        } else if (15 < Temp && Temp <= 25) {
            System.out.println("You can go for a picnic.");
        } else if (Temp > 25) {
            System.out.println("You can go for a swim.");
        }
    }
}
