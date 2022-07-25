package telran.text;

import java.util.Comparator;

public class StringsDatesComparator implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		String [] str1Parts = str1.split("/");
		String [] str2Parts = str2.split("/");
		int res = -1;
		int ind = 2;
		do {
			res = Integer.compare(Integer.parseInt(str1Parts[ind]),
					Integer.parseInt(str2Parts[ind]));
			ind--;
		}while(ind >=0 && res == 0);
		return res;
	}

	
}
