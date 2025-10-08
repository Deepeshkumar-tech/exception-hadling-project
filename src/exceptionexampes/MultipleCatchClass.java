package exceptionexampes;

public class MultipleCatchClass {

    public static void main(String[] args)
    {



           try {

               int a=10/0;
            int arr[] = {12, 13, 14, 15};
            System.out.println("lenght of array" + arr.length);
            System.out.println("first element" + arr[1]);
            System.out.println("fifth element" + arr[5]);

            }


          catch (ArrayIndexOutOfBoundsException e)
         {
            System.out.println("Exception occured in  ArrayIndexOutOfBounds "+e.getMessage());
         }
         catch(ArithmeticException e)
         {
             System.out.println("Exception occured airthmaethic:" + e.getMessage());
         }


    }
}
