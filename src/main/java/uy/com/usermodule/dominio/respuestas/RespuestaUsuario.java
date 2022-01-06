package uy.com.usermodule.dominio.respuestas;

import java.util.List;

public class RespuestaUsuario {
    private int warehouse_id,company_id;
    private List<Integer> accessible_deposits;
    private String _id, email,last_name,name,token,token_nuestro;
    private List<String> permissions,roles;

    public RespuestaUsuario(String _id, int warehouse_id, int company_id, List<Integer> accessible_deposits, String email, String last_name, String name, String token, String token_nuestro, List<String> permissions, List<String> roles) {
        this._id = _id;
        this.warehouse_id = warehouse_id;
        this.company_id = company_id;
        this.accessible_deposits = accessible_deposits;
        this.email = email;
        this.last_name = last_name;
        this.name = name;
        this.token = token;
        this.token_nuestro = token_nuestro;
        this.permissions = permissions;
        this.roles = roles;
    }

    public String getToken_nuestro() {
        return token_nuestro;
    }

    public void setToken_nuestro(String token_nuestro) {
        this.token_nuestro = token_nuestro;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public int getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(int warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public List<Integer> getAccessible_deposits() {
        return accessible_deposits;
    }

    public void setAccessible_deposits(List<Integer> accessible_deposits) {
        this.accessible_deposits = accessible_deposits;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
