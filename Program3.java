//Program 3
public class Program3 {
	
	private void separateString(String s) {
		String temp = "";
		String[] words = s.split("\\s");
		temp = words[0];
		for(String str : words) {
			if(str.length() < temp.length()) {				//condition to check the smallest string
				temp = str;
			}
		}
		System.out.println("Smallest String : "+temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program3 separator = new Program3();
		separator.separateString("Find the smallest string in a list");
	}

}
