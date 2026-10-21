

public class AddingTwoArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6};
        int [] arr2 = {1,2,3,4};
        ArrayAddition(arr1,arr2);
    }
    static void ArrayAddition(int[] arr1 , int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        for (int i = n-1; i >= 0; i--) {
            for (int j = m-1; j >= 0; j--) {
                int NewArr = arr1[i]+arr2[j];
                 System.out.print(NewArr+" ");
                
            }
            
            
        }
    }
    
}
