import java.util.*;

public class Account{

    String accName;
    float bal=0;
    static String accType="Savings";
    Scanner s=new Scanner(System.in);

    public void name(){
        System.out.println("Enter Account Holder Name");
        accName=s.nextLine();
        System.out.println("Account Holder:-"+accName);
    }

    public static void getAccType(){
        System.out.println("Account Type:-"+accType);
        System.out.println("*****************");
    }

    public void deposit(){
        float dep;
        System.out.println("Enter Deposit Amount");
        dep= s.nextFloat();
        bal=bal+dep;
        System.out.println("Current Balance:-"+ bal);
    }              

    public void withdraw(){
        float amt;
        System.out.println("Enter Withdraw Amount");
        amt= s.nextFloat();
        if(bal>=amt){    
        bal=bal-amt;
        System.out.println("Current Balance:-"+ bal);
        }
        else{
        System.out.println("Insufficient Balance");    
        }
    }

    public void getBalance(){
        System.out.println("Acoount Balance:-"+bal);
    }
}