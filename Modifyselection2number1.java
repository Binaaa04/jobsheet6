import java.util.Scanner;
/**
 * Modifyselection2number1
 */
public class Modifyselection2number1 {

    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        int year;
        System.out.println("Enter a leap year: ");
        year=input21.nextInt();

        if (year%4 == 0) 
        if (year%100 != 0 ||(year%100 == 0 && year%400 == 0)) {
            System.out.println("leap year");
        }{
            System.out.println("not a leap year");
      
        }
    }
}