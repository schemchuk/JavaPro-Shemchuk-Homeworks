package de.telran.module2.HomeWorc4;

import java.util.Objects;

public class Client {
    private int id;
    private int status;
    private byte tax_code;
    private byte first_name;
    private byte last_name;
    private byte email;
    private byte addres;
    private byte phone;
    private String created_at;
    private String updated_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public byte getTax_code() {
        return tax_code;
    }

    public void setTax_code(byte tax_code) {
        this.tax_code = tax_code;
    }

    public byte getFirst_name() {
        return first_name;
    }

    public void setFirst_name(byte first_name) {
        this.first_name = first_name;
    }

    public byte getLast_name() {
        return last_name;
    }

    public void setLast_name(byte last_name) {
        this.last_name = last_name;
    }

    public byte getEmail() {
        return email;
    }

    public void setEmail(byte email) {
        this.email = email;
    }

    public byte getAddres() {
        return addres;
    }

    public void setAddres(byte addres) {
        this.addres = addres;
    }

    public byte getPhone() {
        return phone;
    }

    public void setPhone(byte phone) {
        this.phone = phone;
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

    public Client(int id, int status, byte tax_code, byte first_name, byte last_name, byte email, byte addres, byte phone, String created_at, String updated_at) {
        this.id = id;
        this.status = status;
        this.tax_code = tax_code;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.addres = addres;
        this.phone = phone;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Client() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id && status == client.status && tax_code == client.tax_code && first_name == client.first_name && last_name == client.last_name && email == client.email && addres == client.addres && phone == client.phone && Objects.equals(created_at, client.created_at) && Objects.equals(updated_at, client.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, tax_code, first_name, last_name, email, addres, phone, created_at, updated_at);
    }


}
