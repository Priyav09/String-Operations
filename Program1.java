//Program 1
public class Program1 {
	
	private String s1 = "Wipro";
	
	// Method to reverse the string 
	private void displayReverse(String s) {
		
		if(s.equals(s1)) {
			String reversedString = ""  ;
			
			for(int i = s.length()-1 ; i >= 0 ; i--) {
				reversedString = reversedString + s.charAt(i);						//Adding character in reverse order
			}
			
			System.out.println("The reversed String is : "+ reversedString);
		}
		else 
			System.out.println("Reverse Not Supported");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 reverseString =  new Program1();
		reverseString.displayReverse("Wipro");
	}

}
