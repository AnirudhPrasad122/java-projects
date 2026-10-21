import java.util.*;
public class Main {
    public static void main(String[] args){
        char operator ;
        Double a, b, sum, sub, mul;
        Scanner sc = new Scanner(System.in);
        System.out.println("choose a case\n1.Addition\n2.Substraction\n3.Multiplication ");
        operator = sc.next().charAt(0);
        System.out.println("enter the value of a ");
        a = sc.nextDouble();
        System.out.println("enter the value of b");
        b = sc.nextDouble();
        switch (operator) {
            case '1' : sum=a+b;
            System.out.println("ADDITION of digits is" +sum);
            break;
            case '2' : sub=a-b;
            System.out.println("SUBSTRACTION of digits is" +sub);
            break;
            case '3' : mul=a*b;
            System.out.println("MULTIPLICATION of digits is" +mul);
            break;    
            default : System.out.println("Invalid input");
        }
        
    }
}    
    

