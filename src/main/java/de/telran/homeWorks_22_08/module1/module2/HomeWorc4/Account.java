package de.telran.homeWorks_22_08.module1.module2.HomeWorc4;

import java.util.Arrays;
import java.util.Objects;

public class Account {
    private int id;
    private byte[] client_id;
    private String name;
    private int type;
    private int status;
    private long balance;
    private int currency_code;
    private String created_at;
    private String update_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getClient_id() {
        return client_id;
    }

    public void setClient_id(byte[] client_id) {
        this.client_id = client_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public int getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(int currency_code) {
        this.currency_code = currency_code;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(String update_at) {
        this.update_at = update_at;
    }

    public Account(int id, byte[] client_id, String name, int type, int status, long balance, int currency_code, String created_at, String update_at) {
        this.id = id;
        this.client_id = client_id;
        this.name = name;
        this.type = type;
        this.status = status;
        this.balance = balance;
        this.currency_code = currency_code;
        this.created_at = created_at;
        this.update_at = update_at;
    }

    public Account() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && type == account.type && status == account.status && balance == account.balance && currency_code == account.currency_code && Arrays.equals(client_id, account.client_id) && Objects.equals(name, account.name) && Objects.equals(created_at, account.created_at) && Objects.equals(update_at, account.update_at);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, type, status, balance, currency_code, created_at, update_at);
        result = 31 * result + Arrays.hashCode(client_id);
        return result;
    }
}