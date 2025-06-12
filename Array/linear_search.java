import java.util.*;

public class linear_search {

public static int search(int elements[], int key){
   
  for(int i=0; i< elements.length; i++){
       if(elements[i] == key){
       return i;
       }
   }
   return -1;
  }



public static void main(String arg[]){
int elements[]= {2,4,6,8,10,12,14,16};
int key = 10;

// int index = search(elements, key);
// if(index == -1){
//     System.out.println("Not found");
// }else
System.out.println("Key index : "+ search(elements,key));



    }
    
}
