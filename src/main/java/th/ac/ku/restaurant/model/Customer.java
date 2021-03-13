package th.ac.ku.restaurant.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Customer {
    @Id
    private int id;
    private String name;
    private String lastname;
    private double amount;

    public Customer() {}

    public Customer(int id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
