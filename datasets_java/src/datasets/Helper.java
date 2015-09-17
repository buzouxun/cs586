package datasets;

import java.util.Random;

public class Helper {
	
	private static Random random = new Random(System.currentTimeMillis());

	public static String randText(String s, int min, int max) {
		String res = "";
		if(s.length() > min) {
			res = randText(min, max);
		}
		else {
			res = s + randText(min - s.length(), max - s.length());
		}
		return res;
	}
	
	private static String randText(int min, int max) {
		String res = "";
		int randLength = random.nextInt(max - min);
		for(int i = 0; i < randLength + min; i++) {
			char randChar = (char) (((int)'A') + random.nextInt(26));
			res += String.valueOf(randChar);
		}		
		return res;
	}
	
	public static int randInt(int min, int max) {
		int res = min + random.nextInt(max - min);		
		return res;
	}

	public static int randInt(int min, int max, int personId) {
		int res = min + random.nextInt(max - min);
		while(res == personId) {
			res = min + random.nextInt(max - min);
		}
		return res;
	}

}
