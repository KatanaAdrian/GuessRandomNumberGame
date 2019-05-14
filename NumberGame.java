
import java.util.Scanner;
public class NumberGame {

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        //System.out.println("numaru:" + randomNumber);
        System.out.println("I have randomly chosen a nr between [1,100]");
        System.out.println("Try to guess that number");

        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + " guesses left");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
        if(number>randomNumber){
            System.out.println("The number is less than: "+number);
        }

        else    if(number<randomNumber){
                System.out.println("The number is greater than " +number);
            }
            if (number != randomNumber) {
                System.out.println("Try again");
            } else {
                System.out.println("Well done, the correct number was: " + randomNumber);
                break;
            }
        }

    }
}



