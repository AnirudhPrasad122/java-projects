public class towerOfHanoi {
    public static void transitions(int n,char A,char B,char C){
        if(n==0) return;
        transitions(n-1,A,C,B);
        System.out.print(A+"->"+C+"  ");
        transitions(n-1,B,A,C);
    }
    public static void main(String[] args) {
        transitions(100,'A','B','C');
    }
}
