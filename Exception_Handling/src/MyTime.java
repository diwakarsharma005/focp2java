public class MyTime {
   
   private int second;  // [0, 59]
   private int minute;  // [0, 59]
   private int hour;    // [0, 23]

   public void setSecond(int second) {
      if (second >=0 && second <= 59) {
         this.second = second;
      } else {
         throw new IllegalArgumentException("Invalid second!");
      }
   }
   public void setMinute(int minute) {
      if (minute >=0 && minute <= 59) {
         this.minute = minute;
      } else {
         throw new IllegalArgumentException("Invalid minute!");
      }
   }
   public void setHour(int hour) {
      if (hour >=0 && hour <= 23) {
         this.hour = hour;
      } else {
         throw new IllegalArgumentException("Invalid hour!");
      }
   }

   
   public void setMyTime(int second, int minute, int hour) {
      
      this.setSecond(second);
      this.setMinute(minute);
      this.setHour(hour);
   }

   // The constructors (overloaded)
   public MyTime(int second, int minute, int hour) {
   
      this.setMyTime(second, minute, hour);
   }
   public MyTime() {  // The default constructor
      this.second = 0;
      this.minute = 0;
      this.hour = 0;
   }

   
   public int getSecond() {
      return this.second;
   }
   public int getMinute() {
      return this.minute;
   }
   public int getHour() {
      return this.hour;
   }
 
   // Return "hh:mm:ss" with leading zeros.
   public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
   }

   
   public MyTime nextSecond() {
      ++second;
      if (second == 60) {
         second = 0;
         ++minute;
         if (minute == 60) {
            minute = 0;
            ++hour;
            if (hour == 24) {
               hour = 0;
            }
         }
      }
      return this;   
   }
}