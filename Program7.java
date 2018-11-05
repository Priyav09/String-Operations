//Program 7
public class Program7 {
	
	private void toMergeString(String s1 , String s2) {
		StringBuilder mergedString = new StringBuilder();
		int firstLength = s1.length();
		int secondLength = s2.length();
		for(int i=0,j=0 ; i < firstLength || j < secondLength ; i++ , j++) {  //loop to merge two string
			if(i < firstLength ) {
				mergedString.append(s1.charAt(i));
			}
			if(j < secondLength) {
				mergedString.append(s2.charAt(j));
			}
		}
		System.out.println("The merged String : " + mergedString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program7 mergeString = new Program7();
		mergeString.toMergeString("Priya" , "WiproTech");
	}
}
