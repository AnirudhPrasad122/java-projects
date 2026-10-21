import java.util.Scanner;
public class permutationAndCombination {
    public static int fact(int x){
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f *= i;
         }
        return f;
   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int combination = fact(n)/(fact(r)*fact(n-r));
        int permutation = fact(n)/fact(n-r);
        System.out.println(combination + " " + permutation);

    }
    
}
