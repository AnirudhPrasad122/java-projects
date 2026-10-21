public class MaxPositiveAndNegativeIntegerCount {
    public static void main(String[] args) {
        int[] arr={-5,-4,-3,-2,-1,0,0,0,1,2,9,89,97,98};
        int n=arr.length;
        int low=0,high=n-1;
        int idx=-1;
        //negative count
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=0){
                high=mid-1;
            }
            else{
                idx=mid;
                low=mid+1;

            }

        }
        int NegCount=idx+1;
         low=0;
         high=n-1;
        //positive count
        int FirstPos = n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=0){
                FirstPos=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        int PosCount=n-low;
            System.out.println(Math.max(NegCount, PosCount));

    }

}
