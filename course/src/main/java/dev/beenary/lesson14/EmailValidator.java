//package dev.beenary.chapter14;
//
//
//public class EmailValidator {
//
//   private String email;
//
//    public EmailValidator(final String email) {
//        this.email = email;
//    }
//
//    public boolean validateEmail(Validator<String> validator){
//        // create an instance of the Validator class
//        // we need to provide an implementation of the validate() method
//        return ((Validator<String>) o -> email.contains("@") && email.contains(".")) // call validate() method and pass the email.
//        .validate(email);
//    }
//
//    public static void main(String[] args) {
//        String email = "ana@beenary.dev";
//        EmailValidator validator = new EmailValidator(email);
//        boolean isValid = validator.validateEmail();
//        System.out.println("Email " + email + " validation returns " + isValid);
//    }
//}
