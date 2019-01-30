
public class TestMyTime {
   public static void main(String[] args) {
      
      MyTime t1 = new MyTime(59, 59, 23);
      System.out.println(t1);



      
      try {
         MyTime t2 = new MyTime(59, 65, 23);  
         System.out.println("If exception occurs ,this line will be skipped");
      } catch (IllegalArgumentException e) {
         e.printStackTrace();
      }

 
      
   }
}


