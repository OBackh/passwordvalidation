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
    public static boolean hasMixedCase(String password){
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;

        for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(c)){
                    hasLowerCase = true;
                }
                if (hasUpperCase && hasLowerCase) {
                    return true;
                }
            }
            return false;
    }


    public static boolean isCommonPassword(String password){
        String[] wordContainer = {"Password1","Aa345678","12345678", "Password", "PASSWORD", "abcdefgh", "00000000"};

        for(String i : wordContainer){
            if(password == i){
                return true;
            }
        }
        return false;
    }

    public static boolean hasSpecialCharacters(String password) {
        String allowedCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        for (char c : password.toCharArray()) {
            boolean isSpecialCharacter = true;

            for (int i = 0; i < allowedCharacters.length(); i++) {
                char allowedChar = allowedCharacters.charAt(i);
                if (c == allowedChar) {
                    isSpecialCharacter = false;
                    break;
                }
            }

            if (isSpecialCharacter) {
                return true;
            }
        }

        return false;
    }

}