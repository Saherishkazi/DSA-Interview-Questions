public class optimizesPower {

  public static int power(int n, int x){
    if(n ==0){
        return 1;
    }
    int halfpower = power(x,n /2 );
    int call = halfpower *halfpower;
    // n is odd
    if( n % 2==0){
        halfpower = x * halfpower;
    }
    return halfpower;
  }

    public static void main(String args[]){
        int x = 2;
        int n =10;
       System.out.println(power(x,n));
    }
    
}
