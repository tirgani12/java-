package class19;

public class Test {
    public static void main(String[] args) {


        BankAccount ba = new BankAccount();
        ba.accountNumber = 7685909765l;
        ba.money=654887;
        ba.deposit();
        System.out.println(ba.accountNumber);
        System.out.println(ba.money);
        System.out.println("---creating an object of checking account");

        Checking check=new Checking();
        check.accountNumber=5647;
        check.money=780;
        check.interest=0;
        check.deposit();
        check.transfer();
        System.out.println("creating an object of saving account");
        Saving save=new Saving() ;

        save.accountNumber=6758654;
        save.money=2436;
        save.profit=100;
        save.deposit();
        save.takeProfit();

    }
}