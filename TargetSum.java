public class TargetSum {
    public static void main(String[] args) {
        int[] arr ={2,7,11,15};
        int targetSum=9;
        int n = arr.length;
        System.out.println(n);
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] + arr[j] == targetSum){
                    System.out.println("("+i+","+j+")");
                }
            }
        }
    }
}
