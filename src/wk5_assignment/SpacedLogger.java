package wk5_assignment;

/*
 * 6.	The SpacedLogger should add spaces between each character of the String argument passed into its methods.
 * 
 * 
7.	If the log method received “Hello” as an argument, it should print H e l l o


8.	The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)


 */

public class SpacedLogger implements Logger {

	@Override
	public void Log(String log) {
		StringBuilder str = new StringBuilder();
		for ( int i = 0; i < log.length(); i++) {
			str.append(log.charAt(i)).append(" ");
	}
		System.out.println(str);
		System.out.println();
		
	}

	@Override
	public void Error(String error) {
		StringBuilder str = new StringBuilder();
		for ( int i = 0; i < error.length(); i++) {
			str.append(error.charAt(i)).append(" ");
	}
		System.out.println("ERROR: " + str);

}
}
