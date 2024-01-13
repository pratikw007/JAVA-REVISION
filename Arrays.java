import java.util.*;
public class Arrays {

     public static void InnerArray() {
     // Sorting usig array
     int[] arr  = {1,8,55,1};
     System.out.println("Original array:"+arr.length);
     }
        
    public static void main(String[] args) {
        // array
        int age  = 30;
        int phy = 67;
        int chem = 35;
        int eng = 43;
        // create an array of integers
        int[] marks = new int[3];
        System.out.println(marks[1]); //0
        // add elements to the array using index
        marks[0] = 91;
        marks[1] =87;
        marks[2] = 43;

        System.out.println(marks); //[I@76a4d6c
        System.out.println(marks[0]); //91
        System.out.println(marks[1]); //87


        //length of an array
            System.out.println(marks.length); //3
            System.out.println();
            // InnerArray();

            System.out.println("____________________________________________________");


            int[] MK = {89,44,34};
            int[][] finalmarks = {{34,52,32,62},{23,76,78}};
            System.out.println(finalmarks[1][1]);
            

            // Casting 

            // implicit casting 
            double price = 100.00;
            double finalPrice = price + 20;

            System.out.println(finalPrice);

            //Explicit Casting
            int num = 50;
            // int FinalNum = num  + 40.4; //not allowed
            int FinalNum = num +(int) 40.6; //not allowed
            System.out.println(FinalNum); 



           
    }
   
    }

    
    