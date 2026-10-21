public class mazePathh {
    public static int calculate(int sr, int sc , int er , int ec){
        if(sr>er || sc>ec){
            return 0;
        }
        if(sr==er && sc==ec) return 1;
         
        return calculate(sr+1, sc, er, ec) + calculate(sr, sc+1, er, ec);
    }
    public static void main(String[] args) {
        int row = 2;
        int col = 2;
        int ans = calculate(1,1,row,col);
        System.out.println(ans);
        System.out.println("");
        
    }
    
}
