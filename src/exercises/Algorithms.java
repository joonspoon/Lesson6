package exercises;

import java.util.List;

public class Algorithms {

	static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			String egg = eggs.get(i);
			if(egg.contains("crack")) {
				return i;
			}
		}
		return -1;
	}

}
