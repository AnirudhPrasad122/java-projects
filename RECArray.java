public class RECArray {
    static boolean IsSorted(int[] arr,int idx){
        if(idx==arr.length-1) return true;
        if (arr[idx] < arr[idx+1]) {
           return IsSorted(arr, idx+1);
        }
        else return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9,6};
        if(IsSorted(arr,0)){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }
    }
}
