package com.company.denis.Homework10;

public class Password {
    private static Login LoginInfo;

    public static void main(String[] args) {
        try {
            System.out.println(LoginInfo.enterInfo("user21", "pass123", "pass122"));
        } catch (WrongLoginException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }
    }

    public static class Login {
        public static boolean enterInfo(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
            boolean loginOnlyLatinAlphabet = login.matches("^[a-zA-Z0-9_]+$");
            boolean pass1OnlyLatinAlphabet = password.matches("^[a-zA-Z0-9_]+$");
            if (login.length() == 0 || login.length() >= 20 || !loginOnlyLatinAlphabet) {
                throw new WrongLoginException();
            }
            if (password.length() == 0 || password.length() >= 20 || !pass1OnlyLatinAlphabet) {
                throw new WrongPasswordException();
            }
            if (!password.equals(confirmPassword)) {
                System.out.println("Пароли не совпадают");
                return false;
            }
            return true;
        }
    }

    public static class WrongLoginException extends Throwable {
        public WrongLoginException() {
        }

        public WrongLoginException(String message) {
            super(message);
        }

        public String getMessage(){
            return "Wrong login";
        }
    }

    public static class WrongPasswordException extends Throwable {
        public WrongPasswordException() {
        }

        public WrongPasswordException(String message) {
            super(message);
        }

        public String getMessage(){
            return "Wrong password";
        }
    }
}