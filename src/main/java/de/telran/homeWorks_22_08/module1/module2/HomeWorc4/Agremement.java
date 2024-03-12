package de.telran.homeWorks_22_08.module1.module2.HomeWorc4;

import java.util.Objects;

public class Agremement {
    private int id;
    private int account_id;
    private int product_id;
    private long interest_rate;
    private int status;
    private long sum;
    private String created_at;
    private String updated_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public long getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(long interest_rate) {
        this.interest_rate = interest_rate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public Agremement(int id, int account_id, int product_id, long interest_rate, int status, long sum, String created_at, String updated_at) {
        this.id = id;
        this.account_id = account_id;
        this.product_id = product_id;
        this.interest_rate = interest_rate;
        this.status = status;
        this.sum = sum;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Agremement() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agremement that = (Agremement) o;
        return id == that.id && account_id == that.account_id && product_id == that.product_id && interest_rate == that.interest_rate && status == that.status && sum == that.sum && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, account_id, product_id, interest_rate, status, sum, created_at, updated_at);
    }
}
