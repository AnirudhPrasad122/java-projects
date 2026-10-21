package Queue;

import java.util.*;

public class basic {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        System.out.println(q.size());
        q.remove();
        System.out.println(q);
        System.out.println(q.size());
        q.poll();
        System.out.println(q);
        //System.out.println(q.peek());
        //q.clear();
        //System.out.println(q);
        //System.out.println(q.contains(3));
        System.out.println(q.remove());
        System.out.println(q);
    }
}
