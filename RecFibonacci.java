public class RecFibonacci {
    static int Fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
        System.out.println(Fibonacci(i));
        }
    }
}
