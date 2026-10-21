package Queue;

public class ArrayImp {
    public static class QueueA{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];
        public void add(int x){
            if(r==arr.length-1){
                System.out.println("queue is full");
                return;
            }
            if(size==0) {
                f = r = 0;
                arr[0]=x;
            }
            else{
                arr[++r]=x;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                int val = arr[f];
                f++;
                size--;
                return val;
            }
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f];
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }
            for(int i = f ; i<=r ; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        public int size(){
            return size;
        }
    }
    public static void main(String[] args) {
        QueueA q = new QueueA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        System.out.println("Size of Queue is : " + q.size());
        //q.add(1);
        // q.remove();
        // q.remove();
        // q.remove();
        // q.remove();
        // q.remove();
        // q.display();
        // System.out.println(q.peek());
        // System.out.println(q.isEmpty());
   }
}
