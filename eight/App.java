public class App {
    public static int myAtoi(String s) {
        int i=0;
       if(i>=s.length()){
            return 0;
        }
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        if(i>=s.length()){
            return 0;
        }
        boolean neg=false;
        if(s.charAt(i)=='-'){
            neg=true;
            i++;
        }else if(s.charAt(i)=='+'){
            neg=false;
            i++;
        }
        if(i>=s.length()){
            return 0;
        }
        while(i<s.length() && s.charAt(i)=='0'){
            i++;
        }
        if(i>=s.length()){
            return 0;
        }
        long num=0;
        for(int j=i;j<s.length();j++){
        if(num>Math.pow(2, 31)-1){
            if(neg==true){
            num=(long)Math.pow(2, 31);
            num*=-1;
            return (int)num;
        }else{
            num=(long)Math.pow(2, 31)-1;
            return (int)num;
        }
    }
            if(s.charAt(j)>='0' && s.charAt(j)<='9'){
                num*=10;
                num+=s.charAt(j)-'0';
            }else{
                break;
            }
        }
                if(num>Math.pow(2, 31)-1){
            if(neg==true){
            num=(long)Math.pow(2, 31);
            num*=-1;
            return (int)num;
        }else{
            num=(long)Math.pow(2, 31)-1;
            return (int)num;
        }
    }
        if(neg==true){
            num*=-1;
        }
        return (int)num;
    }
}
