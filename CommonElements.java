import java.util.Arrays;
public class CommonElements{
    public static void main(String[] args) {
        int [] a = {1,1,5,5,5,6,7,3,3,2};//   1 1 2 3 3 5 5 5 6 7
        int [] b = {1,1,1,4,4,3,5,5,5,2};//   1 1 1 2 3 4 4 5 5 5
        Arrays.sort(a);
        Arrays.sort(b);
        int [] c = new int[a.length + b.length];
        int i = 0 , j  = 0 , k = 0;
        while(i<a.length && j < b.length){
            if(a[i]==b[j]){
                c[k]=a[i];
                i++;
                j++;
                k++;
            }
            else if(a[i]>b[j]) j++;
            else i++;

        }
        System.out.print(Arrays.toString(Arrays.copyOf(c,k)));
    }

}