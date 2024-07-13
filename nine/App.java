import java.util.*;
public class App {
  public static boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x<10) return true;
        int num1=10;
        int num2=10;
        while(num2<=x/10){
            num2*=10;
        }
        while(x!=0 && num1<=num2){
            int n1=x%num1;
            int n2=x/num2;
            if(n1!=n2){
                return false;
            }
            x-=n1;
            x-=(num2*n2);
            x/=10;
            num2/=100;
        }
        return true;
    }  
    public static void main(String[] args) throws Exception {
       isPalindrome(1000000001);
    }
}
