package zad1;

public class Client implements Comparable<Client>{
    private String firstName;
    private String lastName;
    private int age;
    private double loanAmmount;
    private int loanPeriod;



    @Override
    public int compareTo(Client c) {
        if(this.getLastName().compareTo(c.getLastName()) > 0)
            return 1;
        else if(this.getLastName().compareTo(c.getLastName()) < 0)
            return -1;
        else if(this.getLoanAmmount() > c.getLoanAmmount())
            return 1;
        else if(this.getLoanAmmount() < c.getLoanAmmount())
            return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", loanAmmount=" + loanAmmount +
                ", loanPeriod=" + loanPeriod +
                '}';
    }

    public Client(String firstName, String lastName, int age, double loanAmmount, int loanPeriod) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.loanAmmount = loanAmmount;
        this.loanPeriod = loanPeriod;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getLoanAmmount() {
        return loanAmmount;
    }

    public void setLoanAmmount(double loanAmmount) {
        this.loanAmmount = loanAmmount;
    }

    public int getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(int loanPeriod) {
        this.loanPeriod = loanPeriod;
    }
}
