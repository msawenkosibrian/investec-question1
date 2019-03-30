package za.co.investec;

public class Driver {

	public static void main(String[] args) {
		
		boolean isValid = true;
		
		if (args.length < 2) { // Two or more integers
            System.err.println("Please provide two or  more integers!");
            System.exit(0);
        }
		else {
			int[] numbers = new int[args.length];
			for (int i = 0; i < args.length; i++) {
				try {
					numbers[i] = Integer.valueOf(args[i]);
				}
				catch (Exception e) {
					isValid = false;
		            break;
				}
			}
			if (isValid) {
				// TODO calculate GDC
				System.out.println("Calculate GDC");
			}
			else {
				System.err.println("Please provide two or  more integers!");
	            System.exit(0);
			}
		}
	}
}
