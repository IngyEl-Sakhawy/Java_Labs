import java.util.StringTokenizer;

class Lab7{

public static void main ( String [] args)
{
		if (args.length < 2) {
            System.out.println("Usage: <sentence> <delimiter>");
            return;
        }

        String sentence = args[0];
        String delimiter = args[1];

        StringTokenizer tokenizer = new StringTokenizer(sentence, delimiter);

        int tokenCount = tokenizer.countTokens();
		
        System.out.println("Tokens separated by '" + delimiter + "':");
		
        for (int i = 0; i < tokenCount; i++) {
            System.out.println(tokenizer.nextToken());
        }
    }



}

//'ITI develops people and ITI house of developers and ITI for
//people"