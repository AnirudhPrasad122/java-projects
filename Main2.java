import java.util.Arrays;

public class Main2 {
//     public static void main(String[] args) {
//         int [] arr = {1,2,3,9,9};
//         int n = arr.length;
//         for (int i = n-1; i > 0; i--) {
//             if(arr[i]==9){
//                 arr[i]=0;
//             }
//             else if (arr[i]!=9) {
//                 arr[i]=arr[i]+1;
//                 break;
//             }
            
            
//         }
       
//         System.out.print(Arrays.toString(arr));
//     }
     public static void main(String[] args) {
        int [] arr = {9,9,9,9};
        
        System.out.println(Arrays.toString(PlusOne(arr)));
        
     }
     static int[] PlusOne(int [] arr){
        int n = arr.length;
        for (int i = n-1; i >= 0 ; i--) {
            
            if(arr[i]<9){
                arr[i]=arr[i]+1;
                return arr;
            }
            else{
                arr[i]=0;
            }
        }
        int [] newarr = new int[n+1];
        newarr[0]=1;
        return newarr;
    }
    
    
 }
