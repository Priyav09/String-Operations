//Program 5
public class Program5 {

	private void toToggleString(String s) {
		String toggledString = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) { // Based on condition character will be toggled
				toggledString = toggledString + Character.toLowerCase(s.charAt(i));
			} else {
				toggledString = toggledString + Character.toUpperCase(s.charAt(i));
			}
		}
		System.out.println("The toggled string is : " + toggledString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program5 toggleString = new Program5();
		toggleString.toToggleString("WIpro-SoluTions");
	}
}
