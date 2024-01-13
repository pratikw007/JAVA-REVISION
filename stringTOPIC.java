import java.util.Scanner;
import java.util.*;

public class stringTOPIC
 {
    public static void main(String[] args) {
        //Primitive types - Primitive have fixed capacity and we can not add and delete from it.
        byte age  = 20;
        int phone = 38423233;
        long phone1 = 3842323434444433L;
        float pi = 3.14f;
        char cha = 'a';
        boolean isMale = true;

        // Non primitive types/refrance  -> it does not have fixed size (Variable)
        // it can be create using new keyword
        String names = "John Doe";
        System.out.println(names.length());
        System.out.println(names.toUpperCase());
        System.out.println(names.toLowerCase());

        Scanner friend = new Scanner("Rama");
        System.out.println(friend);
System.out.println("___________________________________________________________");

        // String Operation
    //    concatinate 
    String str1 = "Hello";
    String str2 = "Pratik";
    String result = str1 + " and "+ str2;
    System.out.println(result);

    // CharAt 
     String Name = "PRATIK";
     System.out.println(Name.charAt(3));//T

    //  length
     System.out.println(Name.length()); //6

     //replace 
     String city="New York City";
     String  city2 = city.replace('Y', 'L');
     System.out.println(city2); //New York City

    //  hence prove that the string is immutable.
    
    // substring
    String name = "Aman and pratik";
    System.out.println(name.substring(5,8));

    
    }
}
