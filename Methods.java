public class Methods {
    public static void main(String[] args) {
        PrintJava();
        PrintJava();
        PrintName("Ram");
        System.out.println(sum(6, 8));
        System.out.println("Sucessfully Completed");
    }
    
    public static void PrintJava(){
        System.out.println("Hello Java");
    }

    public static void PrintName(String name){
        System.out.println("Name " + name);
    }

    public static int sum(int a,int b){
        int sum = a + b;
        return sum;
    }
    
}

