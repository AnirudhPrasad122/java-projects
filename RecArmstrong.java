public class RecArmstrong {
    // static int Armstrong(int n,int rev){
    //     if(n==0){
    //         return rev;
    //     }
    //     int d = n%10;
        
    //      return Armstrong(n/10,rev*10+n%10);

    // }
   
    static int Reverse(int n,int rev){
        if(n==0){
            return rev;
        }
        return Reverse(n/10,rev*10+n%10);
    }
    public static void main(String[] args){
    //    System.out.println(Armstrong(1234,0));
    int n=1234321;
     if(Reverse(n,0)==n){
        System.out.println("palindrome number");
     }
     else{
        System.out.println("it is not palinddrome number");
     }
    }
}
