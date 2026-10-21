public class RecursionArray {
    //static void printArray(int[] arr,int idx){
    //     if(idx==arr.length) return;
    //     System.out.print(" "+arr[idx]+" ");
    //     printArray(arr,idx+1);
    // }
    // static int AdditionArray(int[] arr,int idx){
    //     if(idx==arr.length-1) return arr[idx];
    //     return AdditionArray(arr, idx+1)*arr[idx] ;

    // }
    // static int MaximumValue(int[] arr,int idx){
    //     if(idx==arr.length-1){
    //         return arr[idx];
    //     }
    //     int ans = MaximumValue(arr,idx+1);
    //     return Math.max(arr[idx], ans);
    // }
    static int Search(int[] arr,int target,int idx){
        if(idx<0){
            return 0;
        }
        if(arr[idx]==target) return idx;
       return Search(arr, target , idx-1);
     }
    public static void main(String[] args) {
        int[] arr = {2, 8, 6, 4,4,4, 9, 24, 1};
        int n = arr.length-1;
        System.out.println(Search(arr, 4, n));
    }
}
