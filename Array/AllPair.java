public class allPair {

   public static void pair(int number[]){
    //    current
       for(int i=0; i< number.length;i++ ){
           int current = number[i];//2,4,6,8,10
           //
           for(int j=i+1; j < number.length; j++){
               System.out.println("(" + current + "," + number[j] + ")");
               
      }
      System.out.println();
   }

 }
 public static void numPair(int number[]){
//   
    int total = (number.length*(number.length-1)) / 2;
    System.out.println("Total number of pairs: " + total);
   }




    public static void main(String arg[]){
    int number[]={2,4,6,8,10}; 
     pair(number);
    numPair(number);
    }
    
}
