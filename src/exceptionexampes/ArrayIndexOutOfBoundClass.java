package exceptionexampes;

public class ArrayIndexOutOfBoundClass {

    public static void main (String [] args)
    {
        try{
             int arr[]={12,13,14,15};
             System.out.println("lenght of array"+arr.length);
              System.out.println("first element"+arr[1]);
              System.out.println("fifth element"+arr[5]);

         }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception occured"+e.getMessage());

        }



    }

}
