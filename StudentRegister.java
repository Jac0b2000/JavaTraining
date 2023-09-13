import java.util.*;
public class StudentRegister
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        Student a= new Student();
        System.out.println("Enter student name");
        a.name= s.nextLine();
        System.out.println("Enter student age");
        a.age= s.nextInt();
        System.out.println("Enter student RegNum");
        a.regNum= s.next();
        
        System.out.println("School:-" + a.schlNme);
        System.out.println("Name:-" + a.name);
        System.out.println("Age:-" + a.age);
        System.out.println("RegNum:-" +a.regNum);

        s.close();
    }

}