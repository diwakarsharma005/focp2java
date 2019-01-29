 //4. Define an object reference and initialize it to null. Try to call a method through this reference. Now wrap the code in a try-catch clause to catch the exception.
public class ExceptionHandling4
{
   public static void main(String[] args)
   {try{
      String s = null;
      System.out.println( s.toString() );   // 's' is un-initialized and is null

   }
   catch(NullPointerException e)
   {System.out.println(e.toString());}

}}