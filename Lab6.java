
class Lab6{

public static void main(String[] args) {
        String sentence = "Hello Ingy Hello";
        String word = "Hello";
        int count = 0;
        int index = sentence.indexOf(word);
        while (index != -1) {
            count++;
            index = sentence.indexOf(word, index + 1);
        }
        System.out.println("Number of occurrences of '" + word + "': " + count);
    }
	
}