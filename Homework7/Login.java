package com.company.denis.Homework7;

public class Login {
    private String login;
    private String password;

    public Login(String Denis, String Denis123) {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        if (getLogin().compareTo(getPassword()) == 0) {
            System.out.println("Логин пароль совпадает");
        } else {
            System.out.println("Логин и пароль не совпадает");
        }
    }
    public void lol(Login lol) {
        if (lol.getLogin().equals(this.getLogin())) {
            if (lol.getPassword().equals(this.getPassword())) {
                System.out.println("Этот пароль используется другим пользователем.");
            } else {
                System.out.println("Этот логин используется другим пользователем.");
            }
        } else {
            if (lol.getPassword().equals(this.getPassword())) {
                System.out.println("Этот пароль используется другим пользователем.");
            } else {
                System.out.println("Совпадений не найдено.");
            }
        }
    }
    @Override

    public String toString() {
        return "UserInformation{" + "login='" + getLogin() + '\'' + ", password='" + getPassword() + '\'' +'}';
    }

    public void login() {
    }

    public static class Main {
        public static void main(String[] args) {
            Login userInformation = new Login("Den", "Denis");
            Login userInformation1 = new Login("Deni", "Denis12");
            Login userInformation2 = new Login("Denis", "Denis123");

            userInformation.login();

            System.out.println();

            userInformation.lol(userInformation);
            userInformation1.lol(userInformation2);
            userInformation.lol(userInformation2);
        }
    }
}