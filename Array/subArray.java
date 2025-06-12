public class subArray {

   public static void subArr(int number[]){
       int ts=0;
    //    int currSum=0;
       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
      
       for(int i =0 ; i< number.length; i++){
           // System.out.println(i);
           int start= i;
           for(int j=i; j< number.length; j++){
            int sum = 0;
               int end = j;
               for(int k=start; k <=end; k++){
                   System.out.print( number[k]+" " );
                   sum += number[k];
                //    currsum += number[k];
                  
            }
            //   System.out.println(currsum);
            // if(maxSum < currSum){
            //     maxSum = currSum;
            // }
              if(sum > max){
                max = sum;

              }
              if(sum < min){
                min = sum;
              }


            ts++;
            System.out.println("Sum = " + sum); 
            System.out.println();
        
        } 
    }
    System.out.println("Total number of array:"+ ts);
    System.out.println("Minimum subarray sum: " + min);
    System.out.println("Maximum subarray sum: " + max);
   }




    public static void main(String arg[]){
     int number []= {-2,0,-1};
     subArr(number);
    }
}
