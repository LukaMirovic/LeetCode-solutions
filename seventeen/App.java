
import java.util.*;

public class App {
    static char c[][]={
        new char[] {'a','b','c'}, 
        new char[] {'d','e','f'}, 
        new char[] {'g','h','i'}, 
        new char[] {'j','k','l'}, 
        new char[] {'m','n','o'}, 
        new char[] {'p','q','r','s'},   
        new char[] {'t','u','v'}, 
        new char[] {'w','x','y','z'}, 
    };
    
    public static List<String> letterCombinations(String digits) {
        List<String> ret=new ArrayList<>();
        if(digits.equals("")){
            return ret;
        }
        ret.add("");
        List<String> li= new ArrayList<>();
        for(int i=0;i<digits.length();i++){
            int n=digits.charAt(i)-'0'-2;
            for(int j=0;j<c[n].length;j++){
                for(String s: ret){
                    li.add(s+c[n][j]);
                }
            }
            ret.clear();
            ret.addAll(li);
            li.clear();
        }
        return ret;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(letterCombinations("23"));
    }
}
