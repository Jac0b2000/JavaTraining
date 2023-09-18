import java.util.*;
public class MulTbl2{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("**********Multiplication Table using While Loop**********");
        int n; int l; int u;
        System.out.println("Multiplication required?");
        n = s.nextInt();
        System.out.println("Enter the lower boundary");
        l = s.nextInt();
        System.out.println("Enter the upper boundary");
        u = s.nextInt();

        int i=l;
        while(i<=u){
           System.out.printf("\t%d * %d = %d\n",i,n,i*n);
           i++; 
        }
        s.close();
    }
}