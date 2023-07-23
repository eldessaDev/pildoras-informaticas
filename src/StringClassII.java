
public class StringClassII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method subString
		String phrase = "Today is a great day to learn to program";
		String phraseResume = phrase.substring(0, 24) + " go to the beach and forget about it all "
				+ phrase.substring(20, 40);
		System.out.println(phraseResume);
		

	}

}
