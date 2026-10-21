import java.util.Arrays;

public class RotatingArray {
    public static void main(String[] args) {
        int [] arr = {1,4,8,9,3,5,10};

        int d = 10;
        
        RotateArray(arr,d);
        System.out.println(Arrays.toString(arr));

    }
    static void RotateArray(int[] arr, int d){
        int n = arr.length;
        d%=n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

    }
    static void reverse(int [] arr, int i ,int j){
        while(i<j){
            int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
        }
    }
    
}
