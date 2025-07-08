import java.util.*;

public class sumOfNatural {
     public static int Calsum(int n){
   if(n ==1){
      return 1;
   }

     int snm1 = Calsum(n-1);
     int sum = n + snm1;
       return sum;
     }

    public static void main(String args[]){
     int n =5;
     System.out.println(Calsum(n));
    }
    
}
