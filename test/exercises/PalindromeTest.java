package exercises;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {
	
	Palindrome testPalindrome = new Palindrome();

	@Test
	void testLoadWords() {
		assertTrue(testPalindrome.loadWords().contains("peer"));
	}

	@Test
	void wordExist() throws Exception {
		assertTrue(testPalindrome.wordExist("juice"));
	}

	@Test
	void wordIsAPalindrome() throws Exception {
		assertTrue(testPalindrome.IsAPalindrome("Ana"));
		assertFalse(testPalindrome.IsAPalindrome("Marina"));
	}


}