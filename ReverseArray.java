import java.util.Arrays;

public class ReverseArray {
    public void Swap(int[] arr, int a, int b){
           int temp=arr[a];
           arr[a]=arr[b];   
          arr[b]=temp;
         }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int i = 0;
        int j = arr.length-1;
        while(i<j){
          int temp=arr[i];
          arr[i]=arr[j];   
          arr[j]=temp;
          i++;
          j--;
        }
         System.out.println(Arrays.toString(arr));
        // for (int elem : arr) {
        //     System.out.print(elem+" ");
        //}

        }

    
    
}
