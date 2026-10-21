// package HashMap;

// import java.util.LinkedList;

// public class HashMapImplementation {
//     static class MyHashMap<K,V>{
//         public static final int DEFAULT_CAPACITY = 4;
//         public static final float DEFAULT_LOAD_FACTOR = 0.75f;
//         private class Node{
//             K key;
//             V value;
//             Node(K key , V value){
//                 this.key=key;
//                 this.value=value;
//             }
//         }
//         private int n ;
//         private LinkedList<Node>[] buckets;

//         private void initBuckets(int n){
//             buckets = new LinkedList[n];
//             for (int i = 0; i < buckets.length; i++) {
//                 buckets[i] = new LinkedList<>();
//             }

//         }

//         private int HashFunction(K key){
//             int hc = key.hashCode();
//             return (Math.abs(hc)) % buckets.length;
//         }

//         public MyHashMap(){
//             initBuckets(DEFAULT_CAPACITY);
//         }

//         private int searchInBuckets(LinkedList<Node> ll, K key){
//             for (int i = 0; i < ll.length; i++) {
//                 if(ll.get(i).key==key) return i;
//                 return -1;
//             }
//         }

//         public int size(){
//             return n ;
//         }
//         public void put(K key , V value){
//             int bi = HashFunction(key);
//             LinkedList<Node> currBucket = buckets(bi);
//             int ei = searchInBuckets(currBucket,key);
//             if(ei==-1){
//                 Node node = new Node(key, value);
//                 currBucket[bi].add(node);
//                 n++;
//             }
//             else{
//                 Node currNode = currBucket.get(ei);
//                 currNode.value = value;
//             }
//         }
//         public int get(K key){

//         }
//         public V remove(K key){

//         }
//     }
//     public static void main(String[] args) {
//         MyHashMap<String,Integer> mp = new MyHashMap<>();
//     }
// }
