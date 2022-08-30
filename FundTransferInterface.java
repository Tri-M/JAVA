import java.net.SocketOption;
import java.util.*;
abstract class FundTransfer {
    String accountNumber;
    double balance;

    boolean validate(double transfer){
        if(accountNumber.length()==10 && transfer>0 && transfer<balance) {
            return true;
        }
        else{
            System.out.println("Account number or transfer amount seems to be wrong");
            return false;
        }
    }
    FundTransfer(){

    }
    FundTransfer(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    abstract boolean transfer(double transfer);
}

class NEFTTransfer extends FundTransfer
{
    NEFTTransfer(){
        super();
    }
    NEFTTransfer(String accountNumber,double balance){
        super(accountNumber, balance);
    }
    boolean transfer(double transfer){
        if(transfer+transfer*0.05<balance) {
            this.balance-=transfer+transfer*0.05;
            System.out.println("Balance : "+balance);
            return true;
        }
        else{
            return false;
        }
    }


}

class IMPSTransfer extends FundTransfer {
    IMPSTransfer(){
        super();
    }
    IMPSTransfer(String accountNumber,double balance){
        super(accountNumber, balance);
    }

    boolean transfer(double transfer) {
        if (transfer + transfer * 0.02 < balance) {
            this.balance -= transfer - transfer * 0.02;
            System.out.println("Balance : "+balance);
            return true;
        } else
            return false;
    }
}
class RTGSTransfer extends FundTransfer {
    RTGSTransfer(){
        super();
    }
    RTGSTransfer(String accountNumber,double balance){
        super(accountNumber, balance);
    }
    boolean transfer(double transfer) {
        if (transfer > 10000) {
            this.balance -= transfer;
            System.out.println("Balance : "+balance);
            return true;
        } else
            return false;
    }
}

public class Main{
    public static void main(String[] args) {
        IMPSTransfer I=new IMPSTransfer();
        NEFTTransfer N=new NEFTTransfer();
        RTGSTransfer R=new RTGSTransfer();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter account number : ");
        String accountNumber=sc.next();
        System.out.println("Enter balance amount : ");
        double balance=sc.nextDouble();
        System.out.println("1)NEFT");
        System.out.println("2)IMPS");
        System.out.println("3)RTFS");
        System.out.println("Enter the type of transfer to be made");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                NEFTTransfer n1= new NEFTTransfer(accountNumber,balance);
                System.out.println("Enter the amount to be transferred");
                double transferAmt=sc.nextDouble();
                n1.validate(transferAmt);
                n1.transfer(transferAmt);
                break;

            case 2:
                IMPSTransfer i1= new IMPSTransfer(accountNumber,balance);
                System.out.println("Enter the amount to be transferred");
                double transferAt=sc.nextDouble();
                i1.validate(transferAt);
                i1.transfer(transferAt);
                break;
            case 3:
                RTGSTransfer r1=new RTGSTransfer(accountNumber,balance);
                System.out.println("Enter the amount to be transferred");
                double transfer=sc.nextDouble();
                r1.validate(transfer);
                r1.transfer(transfer);
                break;
            default:
                System.out.println("Invalid choice");
        }


    }
 }
