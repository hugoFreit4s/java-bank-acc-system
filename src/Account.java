import java.util.UUID;

abstract class Account {
    private final String id;
    private final String acc_number;
    private final Person acc_holder;
    private double balance;

    public Account(Person acc_holder, String acc_number) {
        this.id = UUID.randomUUID().toString();
        this.acc_holder = acc_holder;
        this.acc_number = acc_number;
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Person getAcc_holder() {
        return acc_holder;
    }

    public String getAcc_number() {
        return acc_number;
    }

    public String getId() {
        return id;
    }
}
