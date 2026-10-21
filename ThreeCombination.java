import java .util.*;
public class ThreeCombination {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int left = i+1;
            int right = arr.length-1;
            while(left<right){
            int sum = arr[i] + arr[left] + arr[right];
            if(sum<0) {
                left++;
            }
            else if(sum>0) {
                right--;
            }
            else {
                System.out.println(arr[i] +" "+ arr[left] + " "+arr[right]);
                left++;
                right--;
                if(arr[i]==-1 && arr[right]==1){
                    break;
                }
            }
            
        }
    }
}
}
