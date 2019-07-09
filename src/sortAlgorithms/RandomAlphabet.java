package sortAlgorithms;

import java.security.SecureRandom;
import java.util.Random;

public class RandomAlphabet {
	
	/**生成随机排序的26个英文字母*/
	public static String[] randomAlphabets() {
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		Random random = new SecureRandom();
		int length = alphabets.length();
		String[] result = new String [26];
		for(int i=0;i<length;i++) {
			int index = random.nextInt(alphabets.length());
			String alphabet = String.valueOf(alphabets.charAt(index));
			result[i] = String.valueOf(alphabet);
			alphabets = alphabets.replace(alphabet, "");
		}
		return result;
	}
	
	public static void main(String [] args) {
		
		String [] randomAlphabets = randomAlphabets();
		
		for(int i=0;i<randomAlphabets.length;i++) {
			System.out.print(randomAlphabets[i]+" ");
		}
	}
}