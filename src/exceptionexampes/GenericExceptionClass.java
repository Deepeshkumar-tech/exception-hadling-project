package exceptionexampes;

public class GenericExceptionClass {
    public static void main(String[] args)
    {



        try {

            int a=10/0;
            int arr[] = {12, 13, 14, 15};
            System.out.println("lenght of array" + arr.length);
            System.out.println("first element" + arr[1]);
            System.out.println("fifth element" + arr[5]);

        }


        catch (Exception e)
        {
            System.out.println("Exception occured : "+e.getMessage()+"------exception name "+ e.getClass());
        }



    }


}
