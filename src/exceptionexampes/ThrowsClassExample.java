package exceptionexampes;

public class ThrowsClassExample {
   public static void Sample() throws IllegalAccessException,InterruptedException {
       System.out.println("Simple method is started");
       int a=10 ;
       if (a == 10) {
           throw new ArithmeticException("a value is 10 and it is uncheched exception");

       }
       if (a == 20) {
           throw new NullPointerException("a value is 20 and it is uncheched exception");

       }
       if (a ==30) {
           throw new IllegalAccessException("a value is 30 and it is checkedd exception");

       }
       if (a == 40) {
           throw new InterruptedException("a value is 40 and it is checked exception");
       }
   }
        public static void main(String[] args)
        {
            try
            {
                Sample();
            }

            catch(Exception e)
            {
                System.out.println("Exception occured;"+e.getMessage()+"---Exception class"+e.getClass());
            }

        }

}
