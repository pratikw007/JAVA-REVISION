import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int userNumber;
        int myNumber = (int)(Math.random()*100);
        System.out.println(myNumber);

        do {
            System.out.println("Guess My Number: ");
           userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("Cogratulatulation You Won the game");
                break;

            }else if (userNumber < myNumber) {
                System.out.println("Your Number is too Small");
            }else{
                System.out.println("Your Number is Large");
            }
            
        } while (userNumber >= 0);

    }
    
}
