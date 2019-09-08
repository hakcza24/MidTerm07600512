package com.example.midterm07600512.Model;

public class Auth {
    private static  final String EMAIL = "game";
    private static  final String PASSWORD = "123";
    private String Email;
    private String Password;

    public Auth(String mEmail, String mPassword) {
        this.Email = mEmail;
        this.Password = mPassword;
    }
    public boolean check(){
        if (Email.equals(EMAIL)&&Password.equals(PASSWORD)){
            return true;
        }
        else {
            return false;
        }
    }
}