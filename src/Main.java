import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        do {
            Scanner sc = new Scanner(System.in);
            if (accounts.isEmpty()) {
                System.out.println("Welcome to your bank, please select the desired option:\n1. Create an account\n0. Exit");
                int answer = sc.nextInt();
                if (answer == 1) {
                    Person user = createAccountForm();
                    accounts.add(user.account);
                    System.out.printf("Account created successfully!\nAccount number: %s\nBalance: %f", user.account.getAcc_number(), user.account.getBalance());
                } else {
                    return;
                }
            } else {
                System.out.println("\nWelcome to your bank, please select the desired option:\n1. Create an account\n2. Access account\n0. Exit");
                int answer = sc.nextInt();
                if (answer == 1) {
                    Person user = createAccountForm();
                    accounts.add(user.account);
                    System.out.printf("Account created successfully!\nAccount number: %s\nBalance: %f", user.account.getAcc_number(), user.account.getBalance());
                }
            }
        } while (true);
    }

    public static Account createAcc(int selectedOption, String name) {
        if (selectedOption == 1) {
            return new SavingsAccount(UUID.randomUUID().toString(), name);
        } else {
            return new CheckAccount(UUID.randomUUID().toString(), name);
        }
    }

    public static Person createAccountForm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the account holder data:");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Last Name: ");
        String lastName = sc.next();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("CPF: ");
        String CPF = sc.next();
        System.out.print("Account type (1 - Saving, 2 - Checking): ");
        int accType = sc.nextInt();
        Account acc = createAcc(accType, name);
        return new Person(name, lastName, CPF, age, acc);
    }
}