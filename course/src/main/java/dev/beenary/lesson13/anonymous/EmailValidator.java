package dev.beenary.lesson13.anonymous;

public class EmailValidator {

    private String email;

    public EmailValidator(final String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        String email = "ana@beenary.dev";
        EmailValidator validator = new EmailValidator(email);
        boolean isValid = validator.validateEmail();
        System.out.println("Email " + email + " validation returns " + isValid);
    }

    public boolean validateEmail() {
        return new Validator<String>() { // create an instance of the Validator class
            @Override // we need to provide an implementation of the validate() method
            public boolean validate(final String o) {
                return email.contains("@") && email.contains(".");
            }
        } // call validate() method and pass the email.
                .validate(email);
    }
}
