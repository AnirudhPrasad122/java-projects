public class MissingArrayElement {
    public static void main(String[] args) {
        int[] arr ={0,1,2,3,4,5,7,8,9,10};  
        int n = arr.length;
        int totalsum = (n*(n+1))/2;
        int arrsum = 0;
        for (int i = 0; i < n; i++) {
            arrsum += arr[i];
        }
        System.out.print(totalsum - arrsum);
    }
    
}
