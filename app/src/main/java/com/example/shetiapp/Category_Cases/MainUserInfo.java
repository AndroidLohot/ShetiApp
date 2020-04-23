package com.example.shetiapp.Category_Cases;

import java.io.Serializable;

public class MainUserInfo implements Serializable {

    // Formal details of user
    private String main_user_id;
    private String main_user_name;
    private String main_user_sirName;
    private String main_user_password;
    private String main_user_gauw;
    private String main_user_taluka;
    private String main_user_jilha;

    public MainUserInfo(String main_user_name, String main_user_sirName, String main_user_password, String main_user_gauw, String main_user_taluka, String main_user_jilha) {
        this.main_user_name = main_user_name;
        this.main_user_sirName = main_user_sirName;
        this.main_user_password = main_user_password;
        this.main_user_gauw = main_user_gauw;
        this.main_user_taluka = main_user_taluka;
        this.main_user_jilha = main_user_jilha;
    }

    public String getMain_user_id() {
        return main_user_id;
    }

    public void setMain_user_id(String main_user_id) {
        this.main_user_id = main_user_id;
    }

    public String getMain_user_name() {
        return main_user_name;
    }

    public void setMain_user_name(String main_user_name) {
        this.main_user_name = main_user_name;
    }

    public String getMain_user_sirName() {
        return main_user_sirName;
    }

    public void setMain_user_sirName(String main_user_sirName) {
        this.main_user_sirName = main_user_sirName;
    }

    public String getMain_user_password() {
        return main_user_password;
    }

    public void setMain_user_password(String main_user_password) {
        this.main_user_password = main_user_password;
    }

    public String getMain_user_gauw() {
        return main_user_gauw;
    }

    public void setMain_user_gauw(String main_user_gauw) {
        this.main_user_gauw = main_user_gauw;
    }

    public String getMain_user_taluka() {
        return main_user_taluka;
    }

    public void setMain_user_taluka(String main_user_taluka) {
        this.main_user_taluka = main_user_taluka;
    }

    public String getMain_user_jilha() {
        return main_user_jilha;
    }

    public void setMain_user_jilha(String main_user_jilha) {
        this.main_user_jilha = main_user_jilha;
    }

    @Override
    public String toString() {
        return main_user_name;
    }
}
