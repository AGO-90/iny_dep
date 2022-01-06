package uy.com.usermodule.controllers.request;

import java.util.List;

public class RequestUsuario {
    private List<Integer> accessible_deposits;
    private int company_id, warehouse_id;
    private String email, name, last_name, password;
    private List<String> roles;

    public RequestUsuario(List<Integer> accessible_deposits, int company_id, int warehouse_id, String email, String name, String last_name, String password, List<String> roles) {
        this.accessible_deposits = accessible_deposits;
        this.company_id = company_id;
        this.warehouse_id = warehouse_id;
        this.email = email;
        this.name = name;
        this.last_name = last_name;
        this.password = password;
        this.roles = roles;
    }


    public List<Integer> getAccessible_deposits() {
        return accessible_deposits;
    }

    public void setAccessible_deposits(List<Integer> accessible_deposits) {
        this.accessible_deposits = accessible_deposits;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public int getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(int warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
