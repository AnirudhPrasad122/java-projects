public class MergeSortedArrays {
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
        int i = 0 , j = 0 , k = 0 ;
        while (i<a.length && j<b.length) { 
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else{
                c[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
            c[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            c[k]=b[j];
            j++;
            k++;
        }
    }
}
