package de.telran.myNewsGroup.module2.nomework6.customer.toTreeMap;

public class Customer implements Comparable<Customer>{
    private String name;
    private String email;
    private String country;
    private int bonusAmount;
    private boolean isEmailConfirmed;

    public Customer(String name, String email, String country, int bonusAmount, boolean isEmailConfirmed) {
        this.name = name;
        this.email = email;
        this.country = country;
        this.bonusAmount = bonusAmount;
        this.isEmailConfirmed = isEmailConfirmed;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public int getBonusAmount() {
        return bonusAmount;
    }

    public boolean isEmailConfirmed() {
        return isEmailConfirmed;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", bonusAmount=" + bonusAmount +
                ", isEmailConfirmed=" + isEmailConfirmed +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        return this.name.compareTo(o.name);
    }
}