package exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidationTest {

	
	@Test
	void testEmailValidation() throws Exception {
		Validation testRegex = new Validation();
		assertTrue(testRegex.emailIsValid("alex95@gmail.com"));
		assertTrue(testRegex.emailIsValid("alexddd@yahoo.com"));
		assertTrue(testRegex.emailIsValid("daddyyyankee!@hotmail.com"));

		assertFalse(testRegex.emailIsValid("9stiffler6@ail.com"));
		assertFalse(testRegex.emailIsValid("akdhvbakhrocketmail.com"));
		assertFalse(testRegex.emailIsValid("123@gmailcom"));
	}

	@Test
	void testPhoneNumbersValidation() throws Exception {
		Validation testRegex = new Validation();
		assertTrue(testRegex.phoneNumberIsValid("+381614892524"));

		assertFalse(testRegex.phoneNumberIsValid("012345789"));
		assertFalse(testRegex.phoneNumberIsValid("zero six one"));
		assertFalse(testRegex.phoneNumberIsValid("u15.985"));
	}

}