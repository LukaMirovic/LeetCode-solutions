import java.util.*;
public class App {
    public static boolean isValid(String s) {
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case('['): 
                st.add(3);
                break;
                case(']'):
                if(st.isEmpty() || st.peek()!=3){
                    return false;
                }
                st.pop();
                break;
                case('('): 
                st.add(1);
                break;
                case(')'):
                if(st.isEmpty() || st.peek()!=1){
                    return false;
                }
                st.pop();
                break;
                case('{'): 
                st.add(2);
                break;
                case('}'):
                if(st.isEmpty() || st.peek()!=2){
                    return false;
                }
                st.pop();
                break;
            }
        }
        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) throws Exception {
        isValid("([)]");
    }
}
