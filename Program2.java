//Program 2
public class Program2 {
	private int upperCount ;
	private int lowerCount ;
	
	// Method to count upper case and lower case character in given string 
	private void displayCount(String s) {
		for(int i = 0 ; i < s.length() ; i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				upperCount++;
			}
			if(Character.isLowerCase(s.charAt(i))) {
				lowerCount++;
			}
		}
		
		if(lowerCount != upperCount) {
			System.out.println("UpperCase characters in given string : "+ upperCount);
			System.out.println("Lowercase characters in given string : "+ lowerCount);
		}
		else
			System.out.println("Equally Distributed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program2 countString = new Program2();
		countString.displayCount("HEllo To All");
	}

}
