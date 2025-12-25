import java.util.Scanner;

public class ReplaceWord {

    // Method to replace a word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        StringBuilder sb=new StringBuilder();
		String[] words=sentence.split(" ");
		
		for(String word:words){
		  if(word.equals(oldWord)){
		    sb.append(newWord+" ");
		  }
		  else{
		   sb.append(word+" ");
		  }
		}
		return sb.toString().trim();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = sc.next();

        System.out.print("Enter new word: ");
        String newWord = sc.next();

        String result = replaceWord(sentence, oldWord, newWord);

        System.out.println("Updated sentence:");
        System.out.println(result);

        sc.close();
    }
}
