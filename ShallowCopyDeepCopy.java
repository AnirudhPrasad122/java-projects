import java.util.Arrays;
public class ShallowCopyDeepCopy{
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        //int[] x = arr;// shallow copy means original copy of the array 
        //x[1]=7;
        //System.out.println(arr[1]);
        int[] deep = Arrays.copyOf(arr, arr.length);
        deep[1]=8;
        System.out.println(arr[1]);

    }

}