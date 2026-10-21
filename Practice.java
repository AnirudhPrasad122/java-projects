import java.util.*;
public class Practice {
    public static int[] removeDuplicate(int[] arr){
        Arrays.sort(arr);
        int[] ans = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            ans[count] = arr[i];
            // ans[i]=arr[i];
            while(i<arr.length-1 && arr[i]==arr[i+1]){
                i++;
                // count++;
            }
            count++;
        }
        System.out.println(count);5
        // int finans[] = new int[count];
        // for(int i = 0 ; i<count;i++){
        //     finans[i] = ans[i];
        // }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = removeDuplicate(arr);
        for(int x : result){
            System.out.println("/n/n"+x);
        }
    }
}
