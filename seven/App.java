public class App {
    public static int reverse(int x) {
        int num=0;
        boolean neg=false;
        int c=x;
        x=Math.abs(x);
        while(x>0){
            if((Math.pow(2, 31)-1)/10<num){
                return 0;
            }
            num*=10;
            num+=x%10;
            x-=(x%10);
            x/=10;
        }
        if(c<0){
            num*=-1;
        }
        return num;
    }
    public static void main(String[] args) throws Exception {
        reverse(-21474836489);
    }
}
