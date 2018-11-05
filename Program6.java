//Program 6
public class Program6 {

	private void rotateString(String s) {
		int strLen = s.length();
		StringBuilder rotatedString = new StringBuilder();
		if (strLen % 2 == 0) {										// string rotated clockwise
			rotatedString.insert(0, s.charAt(strLen - 1));
			rotatedString.insert(1, s.substring(0, strLen - 1));
			System.out.println(rotatedString);
		} else {													// string rotated anti-clockwise
			rotatedString.insert(0, s.substring(1, strLen));
			rotatedString.insert(strLen - 1, s.charAt(0));

			System.out.println(rotatedString);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program6 strOnce = new Program6();
		strOnce.rotateString("Wiprotechnology");
	}
}
