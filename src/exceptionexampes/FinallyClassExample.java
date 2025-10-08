package exceptionexampes;

public class FinallyClassExample {

    public static void main(String[] args)
    {
        //taking examples of exception handlind scenary
       try{
        int a=12;
        int b=0;
        int result=a/b;
        System.out.println("A=" +a);
        System.out.println("B=" +b);
        System.out.println("result=" +result);
       } catch (Exception e) {
           System.out.println("Exception occured:" + e.getMessage());
       }
       finally
         {
             System.out.println("Finally executed");
         }



    }
}
