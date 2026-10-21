public class MergeSortedArray2 {
      public static void main(String[] args) {
        int [] a = {2,5,6,8,9};
        int [] b = {1,3,4,7,10,20};
        int [] c = new int[a.length + b.length];
        merge(c,a,b);
        for (Object elem : c) {
            System.out.print(elem + " ");
        }
        

    }
    public static void merge(int[] c , int[] a , int[] b){
        int i = a.length-1 , j = b.length-1 , k = c.length-1 ;
        while (i>=0 && j>=0) { 
            if(a[i]>b[j]){
                c[k]=a[i];
                i--;
                k--;
            }
            else{
                c[k]=b[j];
                j--;
                k--;
            }
        }
        while(i>=0){
            c[k]=a[i];
            i--;
            k--;
        }
        while(j>=0){
            c[k]=b[j];
            j--;
            k--;
        }
    }
}
