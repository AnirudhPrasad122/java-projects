
import java.util.Scanner;

public class RecString{
    static boolean Reverse(String s , int l , int r){
        if(l>=r) return true;
        if(s.charAt(l)!=s.charAt(r)) return false;
        return Reverse(s,l+1,r-1);
    }

    // static String RemoveA(String s , int idx){
    //     if(idx==s.length()) return " ";
    //     String smallans = RemoveA(s, idx+1);
    //      char currchar = s.charAt(idx);
    //     if(s.charAt(idx)!='a') {
    //         return currchar + smallans;
    //     }
    //     else{
    //          return smallans;
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println((Reverse(s,0,s.length()-1)));
    }
}