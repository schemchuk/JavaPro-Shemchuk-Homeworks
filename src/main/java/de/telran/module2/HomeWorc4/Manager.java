package de.telran.module2.HomeWorc4;

import java.util.Arrays;
import java.util.Objects;

public class Manager {
    private int id;
    private byte first_name;
    private byte last_name;
    private int status;
    private String created_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    private String updated_at;


    public Manager(int id, byte first_name, byte last_name, int status, String created_at, String updated_at) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Manager() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return id == manager.id && first_name == manager.first_name && last_name == manager.last_name && status == manager.status && Objects.equals(created_at, manager.created_at) && Objects.equals(updated_at, manager.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, last_name, status, created_at, updated_at);
    }

}



