import java.util.Arrays;
import java.util.Comparator;

//Program 9
public class Program9 {
	StringBuilder strOddValue = new StringBuilder() ;
	
	// method to sort and extract odd position character to string
	
	private void sortString(String s , CaseSensitive cs) {
		char charStr[] = s.toCharArray();								// converts the string to character array 
		Character[] charString = new Character[charStr.length];
		for(int i = 0 ; i < charStr.length ; i++) {
			charString[i]= charStr[i];					
		}
		
		Arrays.sort(charString, cs);   								// sort the characters in string
		
		for(int i = 0 ; i < charString.length ; i++ ) {
			if(i % 2 == 0) {
				strOddValue.append(charString[i]);					//extracts only odd positioned characters to new string 
			}
		}
		System.out.println(strOddValue);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program9 oddString = new Program9();
		CaseSensitive caseSensitive = new CaseSensitive();
		oddString.sortString("IamGood" , caseSensitive);
	}
}

class CaseSensitive implements Comparator<Character> {

	@Override
	public int compare(Character o1, Character o2) {				//comparator to sort characters 
		// TODO Auto-generated method stub
		if(Character.isUpperCase(o1)) {
			o1 = Character.toLowerCase(o1);
		} 
		if(Character.isUpperCase(o2)) {
			o2 = Character.toLowerCase(o2);
		}
		return o1.compareTo(o2);
	}
}
