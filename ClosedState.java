class ClosedState implements AccountState{
    private Account account;

    public ClosedState(Account account){
        this.account = account;
    }

    @Override
    public void activate(){
        System.out.println("You cannot activate a closed account.");
    }

    @Override
    public void suspend(){
        System.out.println("You cannot suspend a closed account.");
    }

    @Override
    public void close(){
        System.out.println("Account is already closed.");
    }

    @Override
    public void deposit(double amount) {
        System.out.println("You cannot deposit to a closed account.");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("You cannot withdraw from a closed account.");
    }

}