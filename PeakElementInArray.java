

public class PeakElementInArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,5,4,1};
        int peakIndex = peakElement(arr);
        System.out.println("Peak Element Index: " + peakIndex);
        // int i = 1 ;
        // while ( i<=arr.length-1 ){
        //     if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
        //        System.out.println(i);
        //         break;
        //     }
        //     else i ++;



        // }
        
    }
    public static int peakElement(int[] arr){
        int low = 1 , high = arr.length-2;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
            else if (arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) low = mid + 1;
            else high = mid-1;

        }
        return -1;
    }
}
