public class Bank {
    public static double calculateTransaction(double amount, double balance, int transactionType) {
        switch (transactionType) {
            case 1:
                double balanceAfterWithdrawal = amount - balance;
                if (balanceAfterWithdrawal < 0) {
                    System.out.println("Insufficient Balance\nBalance: " + balance);
                    return balance;
                } else {
                    System.out.println("Operation successful\nNew balance: " + balanceAfterWithdrawal);
                    return balanceAfterWithdrawal;
                }
            case 2:
                double balanceAfterDeposit = balance + amount;
                System.out.println("Operation successful\nNew balance: " + balanceAfterDeposit);
                return balanceAfterDeposit;
            default:
                System.out.println("Invalid Transaction\nBalance: " + balance);
                return balance;
        }
    }
}
