import java.util.ArrayList;
import java.util.List;

public class Program8 {

	private void countCharacter(String s) {
		int count = 0, maxCount = 0, minCount = s.length(), a = 0, b = 0;
		char maxChar = ' ', minChar = ' ';
		List<Character> listChar = new ArrayList<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (!(listChar.contains(s.charAt(i)))) {
				for (int j = i; j < s.length(); j++) {
					if ((s.charAt(i)) == (s.charAt(j))) {
						count++;
					}
				}
			}

			if (count > maxCount || count == maxCount) {						//condition to count the maximum occurred character 

				maxChar = s.charAt(i);
				maxCount = count;
				a++;
			}

			if ((count < minCount || count == minCount) && count != 0) {		//condition to count the minimum occurred character 

				minChar = s.charAt(i);
				minCount = count;
				b++;
			}
			count = 0;
			listChar.add(s.charAt(i));
		}
		System.out.println("Maximum occurred character : " + maxChar);
		System.out.println("Minimum occurred character : " + minChar);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program8 program = new Program8();
		program.countCharacter("welcometotechnology");
	}

}
