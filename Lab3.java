
class Lab3{
	
	public static void main(String args[]) {
		
		int num = Integer.parseInt(args[0]);
		if ( num > 0 && args.length==2 )
		for(int i =0 ; i<num ; i++){
			int x=i+1;
System.out.println("Print "+ x + " "+ args[1]);
		} else {
			
			System.out.println("A parameter is missing ");
		}
}
}