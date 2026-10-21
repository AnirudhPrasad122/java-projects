import java.util.*;
public class Functions {
    // public static void Average(int a, int b, int c){
    //     int average = (a+b+c)/3;  
    //     System.out.println(average);     
    //    ** //if we use int so we have to reurn void average and have to print in the main function
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int c = sc.nextInt();
    //     Average(a,b,c);
    // }
    //22222222222222222222222 public static void sumOfOddNumbers(int n){
    //     int i,sum=0;
    //     for(i=1;i<=n;i++){
    //         if(i%2==1){   
            
    //         sum=sum+i;
    //         System.out.println(sum);                
    //         }
            
    //     }
           
    //     //if we use int so we have to reurn void average and have to print in the main function
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     sumOfOddNumbers(n);
        
    // }
    public static void greatestOfTwoNumbers(int a,int b){
        if(a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
             
         }
         public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            greatestOfTwoNumbers(a,b);
            
         }

}
