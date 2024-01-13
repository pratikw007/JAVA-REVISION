import java.util.Scanner;

public class oper {
    public static void main(String[] args) {
        //logical operator
        //&&

        int a = 30;
        int b = 50;

        // if(a<50 && b>50){
        //     System.out.println("Both conditions are true");
        // }
       
        //logical OR 

    // ||
    // if (a<50 || a>50) {
    //     System.out.println("True");
    // }
    //boolean
//  boolean isAdult = false;
//  if (!isAdult) {
//     System.out.println("TRUE");
//  }


Scanner sc = new Scanner(System.in);
//pen =10 notebook =40

int cash = sc.nextInt();
if (cash < 10) {
    System.out.println("Can not buy any pen");
}
else if (cash > 10 && cash < 40) {
    System.out.println("Can get only one things");
}
else{
    System.out.println("can get both");
}

    }
}
