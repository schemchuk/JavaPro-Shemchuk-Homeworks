package de.telran.homeWorks_22_08.module1.module2.HomeWorc4;

import java.util.Objects;

public class Transaction {
    private int id;
    private byte debit_account_id;
    private byte credit_account_id;
    private int type;
    private long description;
    private String deccription;
    private String  created_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte getDebit_account_id() {
        return debit_account_id;
    }

    public void setDebit_account_id(byte debit_account_id) {
        this.debit_account_id = debit_account_id;
    }

    public byte getCredit_account_id() {
        return credit_account_id;
    }

    public void setCredit_account_id(byte credit_account_id) {
        this.credit_account_id = credit_account_id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getDescription() {
        return description;
    }

    public void setDescription(long description) {
        this.description = description;
    }

    public String getDeccription() {
        return deccription;
    }

    public void setDeccription(String deccription) {
        this.deccription = deccription;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public Transaction(int id, byte debit_account_id, byte credit_account_id, int type, long description, String deccription, String created_at) {
        this.id = id;
        this.debit_account_id = debit_account_id;
        this.credit_account_id = credit_account_id;
        this.type = type;
        this.description = description;
        this.deccription = deccription;
        this.created_at = created_at;
    }

    public Transaction() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return id == that.id && debit_account_id == that.debit_account_id && credit_account_id == that.credit_account_id && type == that.type && description == that.description && Objects.equals(deccription, that.deccription) && Objects.equals(created_at, that.created_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, debit_account_id, credit_account_id, type, description, deccription, created_at);
    }
}
