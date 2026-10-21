public class RecCountDigit {
    static int CountDigit(int n){
        if(n>=0 && n<=9){
            return 1;
        }
        return CountDigit(n/10) + 1;
    }
    public static void main(String[] args) {
        System.out.println(CountDigit(1234567891));
    }
}
