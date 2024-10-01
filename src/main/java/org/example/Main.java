package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("PasswordChecker");
    }

    public static boolean isLongEnough(String password){
       return password.length() >= 8;
    }
    public static boolean containsDigits(String password){
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}