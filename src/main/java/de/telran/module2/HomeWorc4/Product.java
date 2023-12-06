package de.telran.module2.HomeWorc4;

import java.util.Arrays;
import java.util.Objects;

public class Product {
    private int id;
    private int manager_id;
    private byte name;
    private int status;
    private int currency_code;
    private long interest_rate;
    private int limit;
    private String created_at;
    private String updated_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product(int id, int manager_id, byte name, int status, int currency_code, long interest_rate, int limit, String created_at, String updated_at) {
        this.id = id;
        this.manager_id = manager_id;
        this.name = name;
        this.status = status;
        this.currency_code = currency_code;
        this.interest_rate = interest_rate;
        this.limit = limit;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Product() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && manager_id == product.manager_id && name == product.name && status == product.status && currency_code == product.currency_code && interest_rate == product.interest_rate && limit == product.limit && Objects.equals(created_at, product.created_at) && Objects.equals(updated_at, product.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, manager_id, name, status, currency_code, interest_rate, limit, created_at, updated_at);
    }
}