import java.util.*;
public class kadanes {

    public static void kad(int num[]){
        int ms =Integer.MIN_VALUE;
        int cs = 0;
        int me = Integer.MIN_VALUE;

        for(int i=0 ;i<num.length;i++){
            cs += num[i];
            ms = Math.max(cs ,ms);
            me =Math.max(me,num[i]);

            if(cs < 0){
                cs =0;
            }
        }
            if(me == 0){
                ms =me;
            }

        System.out.println("max subarray sum is: " +ms);
    }
    public static void main(String[] args) {
    //   int num[] ={-1, -3, -4 ,-1, -2, -1 ,-5, -3};
      int num[] ={-2, -3, 4 ,-1, -2, 1 ,5, -3};
      kad(num);

    }
    
}
