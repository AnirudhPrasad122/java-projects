 class Node{
        int val;
        Node next;
        Node() {
        }
        Node(int val){
            this.val=val;
        }  
    }
    public class LinkedList {
        public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static Node nthNode1(Node head, int n){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        temp = head;
        int m = count - n + 1;
        for (int i = 1; i < m; i++) {
            temp = temp.next;
        }
        System.out.println("the value of node by counting the zero and forloop ::");
        return temp;
    }
    public static Node nthNode2(Node head, int n){
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        System.out.println("the value of node by using slow and fast method ::");
        return slow;
    }
    public static void delnthNode(Node head, int n){
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if(fast==null){
            head = head.next;
            return;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
    }
     public static void main(String[] args) {
            Node a = new Node(10);
            Node b = new Node(20);
            Node c = new Node(30);
            Node d = new Node(40);
            Node e = new Node(50);
            Node f = new Node(60);
            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;
            e.next=f;
            Node t = nthNode1(a,3);//to get nth node from last
            System.out.println(t.val);
            Node u = nthNode2(a,2);//to get nth node from last
            System.out.println(u.val);
            printLinkedList(a);
            delnthNode(a,6);//deleting nth node from the last 
            printLinkedList(a);
            // System.out.println(a.val);
            // System.out.println(a);
            // System.out.println(a.next);
            //System.out.println(f.next);
            // printLinkedList(a);
            // System.out.println();
             //System.out.println(get(a,3));
        }
        public static void printLinkedList(Node head){
            // Node temp = head;
            // while(temp!=null){
            //     System.out.print(temp.val+" ");
            //     temp = temp.next;
            // }
            for(Node temp = head; temp!=null; temp=temp.next){
                System.out.print(temp.val+" ");
            }
            System.out.println();
        }
        private static int get(Node head,int idx){
                // int count = 0;
                // Node temp=head;
                // while(temp!=null){
                //     if(count==idx){
                //         return temp.val;
                //     }
                //     temp=temp.next;
                //     count++;
                // }
                // return -1;
                Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp=temp.next;
                }
                return temp.val;
        }
}
