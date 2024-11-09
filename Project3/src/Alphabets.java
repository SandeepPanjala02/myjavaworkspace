
public class Alphabets {
	public static void printAlphabets() {
		int i = 97;
		while(i<=122) {
			char c = (char)i;
			System.out.println(c+" ");
			i++;
		}
	
	}
	public static void printAlphabet() {
		int i = 65;
		while(i<=97) {
			char c = (char)i;
			System.out.println(c+" ");
			i++;
		}
	
	}

	public static void main(String[] args) {
		printAlphabet();
		printAlphabets();
		
		
	}

}
