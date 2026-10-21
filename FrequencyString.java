public class FrequencyString {
    public static void main(String[] args) {
        String s = "aaabbcc";
        int[] arr = new int [25];
        for (int i = 0; i < s.length(); i++) {
            int ascii = (int)(s.charAt(i));
            arr[ascii-97]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                System.out.println((char)(i+97)+" , "+arr[i]);
            }
        }
    }
}
