import java.util.*;
public class Input
{
    public static void main(String[] args)
    {
      Scanner sc= new Scanner(System.in);
      System.out.println("enter your Name");
      String name= sc.nextLine();
      System.out.println("Enter your age");
      int age= sc.nextInt();
      System.out.println("Name:" + name);
      System.out.println("Age:" + age);

      sc.close();  
    }
}