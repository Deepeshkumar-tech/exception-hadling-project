package exceptionexampes;

public class ThrowClassExample {
    public static void Sample() {
        System.out.println("Simple method is started");
        int a = 10;
        if (a == 10) {
            throw new RuntimeException("Runtime exception");//manually created exception

        }
        System.out.println("Sample method is ended");
    }
           public static void main(String[] args)
           {
           try
            {
            Sample();
            }
          catch(Exception e)
            {
            System.out.println("ocuured exception"+e.getMessage()+"-----runtime Exception"+e.getClass());
           }

       }
}
