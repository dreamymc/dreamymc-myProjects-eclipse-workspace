
public class CommonStringMethods {
//https://www.youtube.com/watch?v=vW53w7me4AE&list=PL27BCE863B6A864E3
	public static void main(String[] args) {
		
		String[] words = {"funk", "chunk", "furry", "baconator"};
		//startsWith
		for (String w : words) {
			if (w.startsWith("fu"))
				System.out.println(w + " starts with fu");
		}
		
		//endsWith
		for (String w : words) {
			if (w.endsWith("unk"))
				System.out.println(w + " ends with unk");
		}

	}

}
