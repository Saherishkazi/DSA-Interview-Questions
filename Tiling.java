import java.util.*;

public class Tiling {

    public static int tiling(int n){
        if(n ==0 || n==1){
            return 1;
        } 
           
        //for vertical
        // int tm1 = tiling(n-1);
        // //for horizontal
        // int tm2 = tiling(n-2);
        // int totalWay = tm1 + tm2;
        // return totalWay;

        return tiling(n-1) +tiling(n-2);
    }
    public static void main(String args[]){
     System.out.println(tiling(3));
    }
    
}
