
package emailformatvalidator;

import java.util.Scanner;


public class EmailFormatValidator {

   
static Scanner console = new Scanner(System.in);

public static void main(String[]agrs){
String email;
String phone;
System.out.println("Please enter your email");
email=console.next();
System.out.println("Please enter your Phone Number");
phone=console.next();

EmailValidator test1 = new EmailValidator();
SAPhoneNumValidator test2 = new SAPhoneNumValidator();


System.out.println("Is the email  " + email+"  Correct? "+test1.isEmailValid(email)+" ");
System.out.println("Is the Phone Number " + phone+"  correct? "+test2.isPhoneNumberValid(phone)+" ");

//console.close();


}

    
}