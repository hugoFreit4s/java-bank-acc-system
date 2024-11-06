public class Person {
    private final String firstName;
    private String lastName;
    private final String CPF;
    private int age;
    Account account;

    Person(String firstName, String lastName, String CPF, int age, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.CPF = CPF;
        this.age = age;
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCPF() {
        return CPF;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
