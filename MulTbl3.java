import java.util.*;
public class MulTbl3{
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
        do{
           System.out.printf("\t%d * %d = %d\n",i,n,i*n);
           i++; 
        }
        while(i<=u);
        s.close();
    }
}