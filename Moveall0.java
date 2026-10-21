// import java.util.Arrays;

// public class Moveall0 {
//    public static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
//     public static void main(String[] args) {
//         int[] arr ={0,1,0,3,12};
//         int i = 0;
//         while(i<arr.length-1){
//             int j = i + 1;
//             if(arr[i]==0 && arr[j]!=0) {
//                 swap(arr,i,j);
//             }
//             else i++;
            
//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }
import java.util.Arrays;

public class Moveall0 {
   public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr ={0,1,0,3,12};
        int nonzero=0;
        int n = arr.length;
        for(int i=0 ; i < n-1;i++){
            if(arr[i]==0){
                int j=i+1;
                while (j < arr.length  && arr[j] == 0) {
                    j++;
                }
                if (j < n) {
                    swap(arr, i, j);
            }
        }
          
    }
     System.out.println(Arrays.toString(arr));
}
}
