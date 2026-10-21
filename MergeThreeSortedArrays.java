public class MergeThreeSortedArrays {
    public static void main(String[] args) {
        int [] a = {1,2,4,7,80,100,101};
        int [] b = {3,5,9,60,70,80};
        int [] c = {6,8,10,11,12};
        int [] d = new int[a.length + b.length+c.length];
        merge(d,a,b,c);
        for (Object elem : d) {
            System.out.print(elem+" ");
            }
    }
    public static void merge(int[] d, int[] a, int[] b, int[] c){
        int i = 0, j = 0, k = 0 , l = 0;
        while(i<a.length && j<b.length && k<c.length){
            if(a[i]<b[j] && a[i]<c[k]){
                d[l++]=a[i++];
             }
             else if(b[j]<a[i] && b[j]<c[k]){
                d[l++]=b[j++];
             }
             else{
                d[l++]=c[k++];
             }
        }
        while(i<a.length && j<b.length){
              if(a[i]<b[j]){
                d[l++]=a[i++];
                 }
            else{
                d[l++]=b[j++];
                }
        }
         while(i<a.length && k<c.length){
              if(a[i]<c[k]){
                d[l++]=a[i++];
                 }
            else{
                d[l++]=c[k++];
                 }
        }
         while(j<b.length && k<c.length){
              if(b[j]<c[k]){
                d[l++]=b[j++];
                }
            else{
                d[l++]=c[k++];
                }
        }
         while(i<a.length){
              d[l++]=a[i++];
        }
         while(j<b.length){
               d[l++]=b[j++];
        }
          while(k<c.length){
              d[l++]=c[k++];
        }
    }
}
