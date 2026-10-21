public class RecursionArray1 {
    static int Index(int[] arr,int target,int n,int idx){
        if(idx>=n) return 1;
        if(arr[idx]==target) {
            System.out.print(idx+"  ");
        }
        return Index(arr,target,n,idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,3,4,4,7,8};
        int target = 4;
        int n = arr.length;
        Index(arr,target,n,0);
    }
}