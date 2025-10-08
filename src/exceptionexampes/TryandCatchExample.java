package exceptionexampes;

public class TryandCatchExample {
    public static void main(String[] args) {
        //taking examples of exception handlind scenary try cach block

        int a = 12;
        int b = 0;
        try {
            //monitor monotor
            System.out.println("exception before occured");
            int result = a / b;
            System.out.println("exception after occured");
        }
        catch(Exception e)
                //handles exceptions
        {
            System.out.println("Exception occured:" + e.getMessage());
        }
        System.out.println("A=" + a);
        System.out.println("B=" + b);
        int result = a / b;
        System.out.println("result=" + result);

    }
}