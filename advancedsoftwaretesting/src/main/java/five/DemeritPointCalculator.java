package five;


public class DemeritPointCalculator {

    private static int SPEED_LIMIT = 65;
    private static int MAX_SPEED = 300;
    private static int KM_PER_DEMERIT_POINT = 5;


   public double calculate (int speed){

       if (speed < 0 || speed > 300){
           throw new IllegalArgumentException("Speed can not be bigger than 300, less than 0");
       }
       if (speed <= SPEED_LIMIT){
           return 0;
       }

       return  (speed - SPEED_LIMIT)/ KM_PER_DEMERIT_POINT;
   }

}
