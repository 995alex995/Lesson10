package exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	public boolean emailIsValid(String email) {
		Pattern pat = Pattern.compile("^(.+)@(.+)$");
		Matcher mat = pat.matcher(email);
		return mat.find();
	}

	public boolean phoneNumberIsValid(String number) {
		Pattern pat = Pattern.compile("\\d{3}-\\d{7}");
		Matcher mat = pat.matcher(number);
		return mat.find();
	}
	
}