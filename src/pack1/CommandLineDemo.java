package pack1;

public class CommandLineDemo {
	
	public static void main(String[] args) {
		System.out.println("Command Line Arguments : ");
		for(int i =0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		
		int no = Integer.parseInt(args[3]);
		System.out.println("No : "+no);
	}

}
