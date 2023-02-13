import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number which is greater than 12: ");
        int number = input.nextInt();
        int sum = 0, count = 0;

        if (number >= 12){
            for ( int i = 1 ; i <= number ; i++){

                if ( (i % 12) == 0 ){
                    sum += i;
                    count++;
                }
            }

            double result = sum / count;

            System.out.println("The average of number up to " + number + " divisible by 12: " + result);

        }else {
            System.out.println("Entered value is under 12. There is no calculation for it.");
        }
    }
}
