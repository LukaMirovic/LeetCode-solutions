import java.util.*;
public class App {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String sb="";
        int i=0;
        String s1=strs[0];
        String s2=strs[strs.length-1];
        while(i<s1.length() && i<s2.length()){
            if(s1.charAt(i)!=s2.charAt(i)){
                break;
            }
            sb+=s1.charAt(i);
            i++;
        }
       return sb;
    }
    public static void main(String[] args) throws Exception {
        String[] c={"flower","flow","flight"};
        longestCommonPrefix(c);
       // longestCommonPrefix({"flower","flow","flight"});
    }
}
