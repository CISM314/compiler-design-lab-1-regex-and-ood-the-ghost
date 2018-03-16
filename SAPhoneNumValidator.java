package emailformatvalidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SAPhoneNumValidator {
    
    public static boolean isPhoneNumberValid(String phoneNumber){
boolean isValid = false;


String expression = "^((?:\\+27|27)|0)(\\d{2})-?(\\d{3})-?(\\d{4})$";
CharSequence inputStr = phoneNumber;
Pattern pattern = Pattern.compile(expression);
Matcher matcher = pattern.matcher(inputStr);
if(matcher.matches()){
isValid = true;
}
//else {
   // System.err.println("Number is not valid");
//}
return isValid;
}
    
}
