
public class Program10 {
	
	private void calculateAge(String s) {
		int len = s.length();
		int firstValue = 0;
		if(Character.isLowerCase((s.charAt(len - 1)))) {
			firstValue = 'a';
		}
		else if(Character.isUpperCase((s.charAt(len - 1)))) {
			firstValue = 'A';
		}
		int  lastChar = s.charAt(len - 1);							
		int age = len + (lastChar - firstValue + 1);				//calculate the age of string 
		System.out.println("Age of string : "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program10 program = new Program10();
		program.calculateAge("Firstb");
	}
}
