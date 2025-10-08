package exceptionexampes;

public class NullPointerExceptionExample {
    public static void main (String [] args)
    {
        try {
            String msg1 = "hi hello";
            String msg2 = null;

            System.out.println("msg1---"  +  msg1);
            System.out.println("msg2---"  +  msg2.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("Exception occured---"  +  e.getMessage());

        }
    }
}
