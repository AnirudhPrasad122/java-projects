public class KeyPad {
    static void PhoneKeyPad(String[] kp,String s,String res){
        if(s.length()==0){
            System.out.print(res+" ");
            return;
        }
        int currNum = s.charAt(0)-'0';
        String currChoice = kp[currNum];
        for(int i=0;i<currChoice.length();i++){
            PhoneKeyPad(kp,s.substring(1), res+currChoice.charAt(i));
        }

    }
    public static void main(String[] args) {
        String s = "25";
        String[] kp = {""," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        PhoneKeyPad(kp, s, " ");
    }
}
