import java.util.Scanner;
public class PrintMyName {
     private static void PrintMyName(String name){
        System.out.println(name+" "+name +" "+name+" "+name);
        return;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        PrintMyName(name);
    }
    
}

