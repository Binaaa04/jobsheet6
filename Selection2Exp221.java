import java.util.Scanner;
/**
 * Selection2Exp221
 */
public class Selection2Exp221 {

    public static void main(String[] args) {
        Scanner input21 = new Scanner (System.in);
        int totalangle;
        System.out.println("Input angle 1 :");
        int angle1 = input21.nextInt();
        System.out.println("Input angle 2 :");
        int angle2 = input21.nextInt();
        System.out.println("Input angle 3 : ");
        int angle3 = input21.nextInt();

        totalangle = angle1+angle2+angle3;
        if (totalangle == 180) {
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("Right Triangle");
            } else {
                System.out.println("Not a Right Triangle");
            }
        } else {
            System.out.println("Not a Triangle");
        }
    }
}