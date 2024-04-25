package dev.beenary.lesson13.local;

public class EmailValidation {

    private String email;

    public static void main(String[] args) {
        String email = "ana@beenary.dev";
        EmailValidation emailValidation = new EmailValidation();
        boolean isValid = emailValidation.isEmailValid(email);
        System.out.println("Email " + email + " validation returns " + isValid);
    }

    public boolean isEmailValid(String email) {
        class EmailValidator {

            public boolean validate() {
                return email.contains("@") && email.contains(".");
            }
        }

        EmailValidator emailValidator = new EmailValidator();
        return emailValidator.validate();
    }
}
