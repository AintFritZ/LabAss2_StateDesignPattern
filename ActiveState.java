class ActiveState implements AccountState{
    private Account account;

    public ActiveState(Account account){
        this.account = account;
    }

    @Override
    public void withdraw(double amount){
       account.setbalance(account.getBalance() - amount);
       System.out.println("New balance: " + account.getBalance());
    }

    @Override
    public void deposit(double amount){
        account.setbalance(account.getBalance() + amount);
        System.out.println("New balance: " + account.getBalance());
     }

     @Override
    public void activate(){
        System.out.println("Account is already active.");
    }

    @Override
    public void suspend(){
        account.setState(new SuspendedState(account));
        System.out.println("Account is now suspended.");
    }

    @Override
    public void close(){
        account.setState(new ClosedState(account));
        System.out.println("Account is now closed.");
    }
}