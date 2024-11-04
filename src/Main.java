public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Hugo", "Freitas", "hugo@hotmail.com", "319232132", "Rua 1 - Mangueiras", "000.000.000-00", 21);
        SavingsAccount acc1 = new SavingsAccount("1", person1);
        acc1.setBalance(Bank.calculateTransaction(1450.00, acc1.getBalance(), 2));
        acc1.setBalance(Bank.calculateTransaction(100, acc1.getBalance(), 1));
    }
}