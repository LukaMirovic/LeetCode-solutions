import java.util.*;
public class App {
    public int romanToInt(String s) {
        int num=0;
        int curr=0;
        for(int i=s.length()-1;i>=0;i--){
            switch(s.charAt(i)){
                case 'I':
                if(curr>1){
                    num-=1;
                }else{
                    num+=1;
                }
                curr=1;
                break;
                case 'V':
                num+=5;
                curr=5;
                break;
                case 'X':
                if(curr>10){
                    num-=10;
                }else{
                    num+=10;
                }
                curr=10;
                break;
                case 'L':
                num+=50;
                curr=50;
                break;
                case 'C':
                if(curr>100){
                    num-=100;
                }else{
                    num+=100;
                }
                curr=100;
                break;
                case 'D':
                num+=500;
                curr=500;
                break;
                case 'M':
                num+=1000;
                curr=1000;
                break;
            }

        }
        return num;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
