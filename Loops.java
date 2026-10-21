import java.util.*;
public class Loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j,sum;
        int n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++)
        {
            sum=i+j;
            if(sum%2 == 0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }
        System.out.println();
        }
        
        }
        
        
    
}        

    
