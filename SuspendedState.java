class SuspendedState implements AccountState{
    private Account account;

    public SuspendedState(Account account){
        this.account = account;
    }

    @Override
    public void activate(){
        account.setState(new ActiveState(account));
        System.out.println("Your account is now activated.");
    }

    @Override
    public void suspend(){
        System.out.println("You account is already suspended.");
    }

    @Override
    public void close(){
        account.setState(new ClosedState(account));
        System.out.println("Your account is now closed.");
    }

    @Override
    public void deposit(double amount) {
        System.out.println("You cannot deposit to a suspended account.");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("You cannnot withdraw from a closed account");
    }
}