// public class trialRecursion {
//     public static int FirstOccurance(int[] arr,int low,int high,int target,int idx){
//         if(low>high) return idx;
//         int mid = (low+high)/2;
//         if((arr[mid] > target)) return FirstOccurance(arr, low, mid-1, target,idx);
//         else if((arr[mid] < target)) return FirstOccurance(arr, mid+1, high, target,idx);
//         else{
//              idx = mid;
//             return FirstOccurance(arr, low, mid-1, target,idx);
//         }
//     }
//     public static void main(String[] args) {
//         int [] arr = {1,1,2,2,3,3,3,4,4,5,5,6,6,7,7,7,7,8,8,9,9};
//         int n = arr.length;
//         int low = 0 , high = n-1;
//         int index = FirstOccurance(arr,low,high,2,-1);
//         System.out.println(index);
//     }
// }
public class trialRecursion {
    public static int LastOccurance(int[] arr,int low,int high,int target,int idx){
        if(low>high) return idx;
        int mid = (low+high)/2;
        if((arr[mid] > target)) return LastOccurance(arr, low, mid-1, target,idx);
        else if((arr[mid] < target)) return LastOccurance(arr, mid+1, high, target,idx);
        else{
             idx = mid;
            return LastOccurance(arr, mid+1, high, target,idx);
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,3,3,4,4,5,5,6,6,7,7,7,7,8,8,9,9};
        int n = arr.length;
        int low = 0 , high = n-1;
        int index = LastOccurance(arr,low,high,2,-1);
        System.out.println(index);
    }
}
