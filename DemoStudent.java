class Student{
    public void medical(){
        System.out.println("you are taking medical services");
    }
    public void plumber(){
        System.out.println("you are using plumber service");

    }
    public void food(){
        System.out.println("you are using food service");
    }
    public void homedelivery(){
        System.out.println("you are using delivery services");
    }
}
public class DemoStudent{
public static void main(String arg[]) {
    Student s=new Student();
    s.medical();
    s.plumber();
    s.food();
    s.homedelivery();

}

}