public class Lab8 {
    public static void main(String args[]) {
        int count = 0;
		
		if (args.length < 1) {
            System.out.println("Usage: <Enter A Valid IP> ");
            return;
        }
		
		
        String sentence = args[0];

        String[] parts = sentence.split("\\.");

        for (int i = 0; i < parts.length; i++) {
                count++;
        }
		
		System.out.println("count:" + count);
 
        if (count!=4)
		{
			System.out.println("Enter a Valid IP");
			return;
		}
		
		
		for (int i=0 ; i< parts.length; i++)
		{   int dicimal = Integer.parseInt(parts[i]);
			if ( dicimal>=0 && dicimal<= 225)
			{
				System.out.println("part:"+i+"is valid");
			} else {
				System.out.println(" invalid IP");
				return;
			}
			
		}
    }
}
