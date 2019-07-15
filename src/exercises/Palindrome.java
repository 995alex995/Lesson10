package exercises;
import java.util.ArrayList;
import java.util.List;

import examples.FileHelper;

import examples.FileHelper;

public class Palindrome {

	List<String> words = new ArrayList<String>();

	Palindrome() {

		words = loadWords();
	}

	public List<String> loadWords() {
		return FileHelper.loadFileContentsIntoArrayList("resource/words.txt");
	}

	public boolean wordExist(String wrd) {

		return words.contains(wrd);
	}

	public boolean IsAPalindrome(String IAP) {
		return wordExist(IAP) && wordExist(new StringBuilder(IAP).reverse().toString());
	}
}