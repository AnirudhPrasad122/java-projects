import java.util.*;
public class Patterns {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
            int n = sc.nextInt();
            int i,j;
           /*  for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");

                }
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=n-1;i>=1;i--){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");

                }
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }5
            *
           ***
          *****
         *******
        *********
         *******
          *****
           ***
            */
        /*for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(j=1;j<=2*(n-i);j++) {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){// forj<=n it makes rhombus on right side
                System.out.print("*");
            }
            System.out.println(); 
        }
        for(i=n-1;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(j=1;j<=2*(n-i);j++) {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(); 
        }5
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *    */

/*for(i=1;i<=n;i++){
    for(j=1;j<=2*(n-i);j++) {
        System.out.print(" ");
    }
    for(j=1;j<=n;j++){// forj<=n it makes rhombus on right side
        System.out.print("*");
    }
    System.out.println(); 
}5
        *****
      *****
    *****
  *****
*****    */
         /*for(i=1;i<=n;i++){
                for(j=1;j<=n-i;j++){
                    System.out.print(" ");

                }
                for(j=1;j<=i;j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }5
    * 
   * *
  * * *
 * * * *
* * * * *  */

        /*for(i=1;i<=n;i++){
                for(j=1;j<=n-i;j++){
                    System.out.print(" ");

                }
                for(j=1;j<=i;j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
            int a=n/2;
            for(i=1;i<=a;i++){
                for(j=1;j<=n-n/3;j++){
                    System.out.print(" ");
                

            }
               for(j=1;j<=a;j++){
                    System.out.print("*");

        } 
        System.out.println(); 
            }
        5
    *    
   * *                CHRISTMAS TREE
  * * *  
 * * * * 
* * * * *
    **
    **   */ 
    for (i = 0; i < n; i++) {
        for(j=i;j<n;j++){
            System.out.print("  ");
             
        }
        for(j=0;j<i;j++){
            
            System.out.print("* ");
        }
        for(j=0;j<i-1;j++){
            System.out.print("* ");
        }
System.out.println( );
        
    }


    }
    
    
}