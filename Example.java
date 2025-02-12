public class Example{
    public static void main(String[] args) {
        Account account = new Account("fritz", 500);

        account.deposit(3000);
        account.close();
        account.deposit(500);
        account.withdraw(200);
        account.activate();
    }
}