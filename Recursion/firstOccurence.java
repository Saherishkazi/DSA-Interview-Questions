public class firstOccurence {

    public static int LastOccurence(int[] arr, int key,int i){
        if(i == arr.length){
            return -1;
          
        }
        int isfound = LastOccurence(arr, key, i+1);
            if(isfound == -1 && arr[i] == key){
                return i;

        }
         return isfound;
     }
    
     public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int a = power(x, n-1);
        int sum = a * x;
        return sum;
     }
    
    public static void main(String args[]){
    // int arr[] = {8,3,6,9,5,10,2,5,3};
    // int key = 5;
    // System.out.print(LastOccurence(arr, key, 0));


    // power(2, 10);
    }
    
}
