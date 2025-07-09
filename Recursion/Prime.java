public class Prime {

    public static int fun(int arr[], int key,int i){
      
        if(i == arr.length){
          return -1;
        }
       if(arr[i] ==key){
        return i;
    }
    
    return fun(arr, key,i+1);
    
}
      
      public static void main(String args[]){
          int arr[] ={2,1,4,6,7,3,6};
          int key = 6;
          System.out.println(fun(arr, key, 0));
        }
    }

