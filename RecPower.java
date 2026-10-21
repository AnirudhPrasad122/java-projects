public class RecPower {
    // static int Power(int a , int b){
    //     if(b==1){
    //         return a;
    //     }
    //     return Power(a,b-1) * a;
    // }
     static int Power(int a , int b){
        if(b==0) return 1;
        
        int smallPow = Power(a,b/2);
        if(b%2==0) return smallPow*smallPow;
        return a*smallPow*smallPow;
        

        
    }
    public static void main(String[] args) {
        System.out.println(Power(2,6 ));
    }
}
