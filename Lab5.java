public class Lab5 {
    public static void main(String args[]) {
        int count = 0;
        String theWord = "Hello";
        String theSentence = "Hello to the world-Hello";

        String[] parts = theSentence.split("[^a-zA-Z]+");

        for (int i = 0; i < parts.length; i++) {
            if (theWord.equals(parts[i])) {
                count++;
            }
        }

        System.out.println("The count is " + count);
    }
}
