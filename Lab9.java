class Lab9{


    public static void main(String args[]) {
        int count = 0;
        String theWord = args[1];
        String theSentence = args[0];

        String[] parts = theSentence.split("[^a-zA-Z]+");

        for (int i = 0; i < parts.length; i++) {
            if (theWord.equals(parts[i])) {
                count++;
            }
        }

        System.out.println("The count is " + count);
    }


}