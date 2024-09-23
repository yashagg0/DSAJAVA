package week5;
// public class day10 {  //BINARY SEARCH
//     public static void main(String[] args) {
        // int low = 1;
        // int high = Integer.MAX_VALUE;
        // int mid = (low+high)/2;
        // System.out.println(mid);

        // int midq = high -(high-low)/2;
        // System.out.println(midq);


        //BINARY SEARCH ON A SEARCHED SPACE
//     }
    
// }

public class day10{
        static boolean Check(int speed, int distance, int time){
                int dist_travelled = speed*time;
                // if(dist_travelled >= distance){
                //         return true;
                // }
                // else
                // return false;
                return (dist_travelled >= distance);
        }
        static int reachCenter(int distance, int time){
                int lowSpeed = 0;
                int highSpeed = 200;
                int optimalSpeed = -1;

                while (lowSpeed <= highSpeed){
                        int midSpeed = highSpeed - (highSpeed - lowSpeed)/2;
                        if(Check(midSpeed,distance,time)){
                                optimalSpeed = midSpeed;
                                highSpeed = midSpeed - 1;
                }
                else
                lowSpeed = midSpeed + 1;
        }
                return optimalSpeed;
        }

        public static void main(String[] args){
                //REACH PITAMPURA
                int distance = 50;
                int time = 2;
                System.out.println(reachCenter(distance, time));
        }
}
