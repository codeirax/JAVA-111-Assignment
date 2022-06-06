package bankExeption;

public class BankDemo {
	
    public static void main(String[] args) {
        SavingAccount person=new SavingAccount();

        SavingAccount.accountNumber=123;
        SavingAccount.balance=10000;

        person.deposit(2500);

        try {
           double balance= person.withdraw(2000);
            System.out.println("Balance after withdrawal "+balance);
        } 
        catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }
        
        
        
    }
}