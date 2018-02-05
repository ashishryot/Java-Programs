import java.util.*;

class Anagram{
	public static void main(String args[]){
		for (int i = 0; i <= s1.length() - p.length(); i++) {
			int k = p.length();
			Hashtable<Character, Integer> ht = new Hashtable<>();
			for (int j = 0; j < p.length(); j++) {
				if(ht.containsKey(p.charAt(j))) {
					ht.put(p.charAt(j), ht.get(p.charAt(j))+1);
				}
				else {
				ht.put(p.charAt(j), 1);
				}
			}
			for (int j = 0; j < p.length(); j++) {
				if (ht.containsKey(s1.charAt(i + j)) && ht.get(s1.charAt(i + j)) != 0) {
					k--;
					ht.put(s1.charAt(i + j), ht.get(s1.charAt(i + j))-1);
					// if()

				} else {
					break;
				}
			}

			if (k == 0) {
				ar.add(i);
			}
		}

		System.out.println(ar);

	}
}