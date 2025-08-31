public class FriendPair {

    public static int pair(int n){
        if(n ==1 || n==2){
         return n;
        }
        
    //     int tm1 = pair(n-1);
    //     int tm2 = pair(n-1)* pair(n-2);
    //    int totalWay = tm1 +tm2;
       return pair(n-1) +(n-1) *pair(n-2);

    }
    public static void main(String args[]){
     System.out.println(pair(3));
    }
    
}

