public class RecPrintIncreasing {
    // static void IncreasingOrder(int n){
    //     if(n==1){
    //         System.out.print(n+" ");
    //         return;
    // }
    // IncreasingOrder(n-1);
    // System.out.print(n+" ");
    // }
    static void DecreasingOrder(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
    }
    System.out.print(n+" ");
    DecreasingOrder(n-1);
    
    }

    public static void main(String[] args) {
        DecreasingOrder(5);
    }
}
