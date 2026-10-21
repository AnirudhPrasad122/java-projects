// import java.util.ArrayList;
// import java.util.Scanner;

// public class Recursion {
//     //Main Question
    
//     static ArrayList<String> getSSQ(String s){
//         ArrayList<String> ans = new ArrayList<>();
//         if(s.length()==0){
//             ans.add("");
//             return ans;
//         }
//         char currChar = s.charAt(0);
//        ArrayList<String> smallAns = getSSQ(s.substring(1));
//        for (String ss : smallAns) {
//            ans.add(ss);
//            ans.add(currChar+ss);
//         }
//         return ans;
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         ArrayList<String> result = getSSQ(s);
//         System.out.println(result);
        
//     }
// }

// import java.util.Scanner;

// public class Recursion {
//     static void GetSSQ(String s , String currAns){
//         if(s.length()==0){
//             System.out.println(currAns);
//             return;
//         }
//         char currChar = s.charAt(0);
//         String remString = s.substring(1);
//         GetSSQ(remString, currAns+currChar);
//         GetSSQ(remString, currAns);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         GetSSQ(s, "");
//     }
// }

public class Recursion {
    static void GetSSQ(int [] arr,int n,int idx,int sum){
        if(idx>=n){
            System.out.println(sum);
            return;
        }
        GetSSQ(arr, n, idx+1, sum+arr[idx]);
        GetSSQ(arr, n, idx+1, sum);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5};
        GetSSQ(arr,arr.length,0,0);
    }
}
