package ownexceptionexamples;

public class SampleMain {
    public static void main(String[] args)
    {
        try
          {

             int a = 10;
             if (a == 10)
             {
                throw new MyOwnExceptionClass("myexception occured");
              }
          }
             catch(Exception e)
             {
                System.out.println("Exception occured;"+e.getMessage());
             }

    }
}
