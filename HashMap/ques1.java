package HashMap;
import java.util.*;

public class ques1 {
    public static void main(String[] args) {
        Map<Integer,Integer> mp = new HashMap<>();
        int[] arr = {1,3,2,1,4,1};
        for(int i : arr){
            if(!mp.containsKey(i)) mp.put(i, 1);
            else mp.put(i, mp.get(i)+1);
        }
        System.out.println(mp.entrySet());
        int maxfreq = 0 , anskey = -1;
        for(var e : mp.entrySet()){
            if(e.getValue()>maxfreq){
                maxfreq=e.getValue();
                anskey=e.getKey();
            }
        }
        System.out.printf("      %d has the highest freq of %d  " , anskey ,maxfreq);
    }
}
