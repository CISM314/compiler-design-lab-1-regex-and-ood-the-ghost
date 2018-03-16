
package emailformatvalidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailValidator {
    public static boolean isEmailValid(String email){
boolean isValid = false;


//Initialize regex for email.
String expression = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
CharSequence inputStr = email;
//Make the comparison case-insensitive.
Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
Matcher matcher = pattern.matcher(inputStr);
if(matcher.matches()){
isValid = true;
//System.out.println("The email is Valid");
}
//else 
//{
  //  System.out.println("The email is invalid");
//}
return isValid;
}
    
}
