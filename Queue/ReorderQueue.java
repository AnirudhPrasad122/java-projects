package Queue;

import java.util.*;

public class ReorderQueue {
    public static void ReorderQUEUE(Queue<Integer> q){ // input  1 2 3 4 5 6 7 8 
        int size = q.size();                           // output 1 5 2 6 3 7 4 8  
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i<size/2 ; i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        for(int i = 0 ; i<size/2 ; i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
            q.add(q.remove());
        }
        while(q.size()>0) st.push(q.remove());
        while(st.size()>0) q.add(st.pop());
        System.out.println(q);
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(q);
        ReorderQUEUE(q);
    }
}
