class Account{
    private String AccountNumber;
    private double balance;
    private AccountState state;

    public Account(String AccountNumber,double balance){
        this.AccountNumber = AccountNumber;
        this.balance = balance;
        this.state = new ActiveState(this);
    }

    public double getBalance(){
        return balance;
    }

    public void setState(AccountState state){
        this.state = state;
    }

    public void setbalance(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        state.deposit(amount);
    }

    public void withdraw(double amount){
        state.withdraw(amount);
    }

    public void activate(){
        state.activate();
    }

    public void suspended(){
        state.suspend();
    }

    public void close(){
        state.close();
    }
}