public class AddingTwoArrays {
    public static void main(String[] args) {
        int [] a = {2,8,9,1,4,6};
        int [] b = {2,9,8,1,4};
        int [] c = new int[a.length + 1];
        Add(c,a,b);
        for (Object elem : c) {
            System.out.print(elem + " ");
        }
    }
    public static void Add(int[] c , int[] a ,int[] b){
        int i = a.length-1 , j = b.length-1 , k = c.length-1;
        int e=0;
        while(i>=0 && j>=0){
            int d = a[i] + b[j];
            c[k]=(d%10)+e;
            e = 0;
            e = d/10;
            i--;
            j--;
            k--;

        }
        while (i >= 0) {
            int d = a[i] + e;
            c[k] = d % 10;
            e = d / 10;
            i--;
            k--;
        }
        while (j >= 0) {
            int d = b[j] + e;
            c[k] = d % 10;
            e = d / 10;
            j--;
            k--;
        }
        if (e > 0) {
            c[k] = e;
        }
    }
}
