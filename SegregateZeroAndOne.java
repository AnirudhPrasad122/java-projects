import java.util.Arrays;

public class SegregateZeroAndOne {
    public static void main(String[] args) {
        int [] arr = {0,1,1,0,0,1,0};
        System.out.println("array before segregation" + Arrays.toString(arr));
        int i = 0;
        int j = arr.length - 1;
        
            while(i<j){
                if (arr[i]==0){
                 i++;
                 }
                 else if (arr[j]==1) {
                 j--;
                 }
                else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
                }
                

            }
            
     System.out.println("array after segregation ::::");     
     System.out.print(Arrays.toString(arr));   

    }
    
}
// import java.util.Arrays;

// public class SegregateZeroAndOne {
//     public static void main(String[] args) {
//         int [] arr = {0,1,1,0,0,1,0};
//         int i = 0;
//         int j = arr.length - 1;

//         while (i < j) {
//             if (arr[i] == 0) {
//                 i++;
//             } 
//             else if (arr[j] == 1) {  // check for 1 on the right side
//                 j--;
//             } 
//             else {  // swap when arr[i] == 1 and arr[j] == 0
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//                 i++;
//                 j--;
//             }
//         }

//         System.out.println(Arrays.toString(arr));
//     }
// }

