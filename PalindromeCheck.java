import java.util.*;
    public class PalindromeCheck {

       
        public static boolean isPalindrome(int num) {
           int n = num;
            int reverNum = 0;

            while (n > 0) {
                int lastDigit = n % 10; 
                reverNum = (reverNum * 10) + lastDigit; 
                n = n / 10; 
            }
        if(num == reverNum){
            return true;
        }else{ 
            return false;

        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int  n = 121;
        // int n2 = 321;
        
        if(isPalindrome(num)){
            System.out.println(num + " palindrome");
        }else{
            System.out.println(num + " is not palindrome " );

        }
        }
    }
    
    

