import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // While loop - executes as long as the condition is true.
        //loops
        // System.out.println("1");
        // System.out.println("2");
        // System.out.println("3");

  //for looop

        // for(int i = 10;i >= 1;i--){
        //     System.out.println(i);
        // }


//While loop
        // int i = 1;
        // while (i<=10) {
        //     System.out.println(i);
        //     i++;
        // }

//do While  Loop
// int i =1;
// do{
//    System.out.println(i);
//    i++;
// }while(i<10);


// Using Scannerr Class 
Scanner sc = new Scanner(System.in);
System.out.println("Enter A NUmber Which you to print on console");
 int n = sc.nextInt();

 for (int i = 1; i <= n; i++) {
    System.out.print(i + " ");
 }
 System.out.println();

 System.out.println("THE END");
    }




}

