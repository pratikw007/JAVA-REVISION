public class ERRORHANDLE {

    public static void main(String[] args) {
        // TRY - CATCH in Exception Handling
    
        int marks[] = {65,77,87,46,98,69};

        try{
            System.out.println(marks[6]);
        } catch(Exception exception){

            System.out.println("Element not Found in Array");
        }

    }
    
}
