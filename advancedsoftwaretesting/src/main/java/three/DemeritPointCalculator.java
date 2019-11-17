package three;


public class DemeritPointCalculator {

    private static int SPEED_LIMIT = 65;
    private static int KM_PER_DEMERIT_POINT = 5;


   public double calculate (double speed){
       if (speed <= SPEED_LIMIT){
           return 0;
       }

       return  (speed - SPEED_LIMIT)/ KM_PER_DEMERIT_POINT;
   }

}
