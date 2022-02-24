package videos;

public class Objects {

	public static void main(String[] args) {
		// differences between primitives and objects:
		// primitives have only the value assign to them, nothing more. (do not have properties or methods attached to them)
		int age = 34; 
		
		//Objects have the assigned value plus additional properties and methods.
		String name = "Sally Mae";
		System.out.println(name.length());
		System.out.println(name.charAt(6));
		// length is a method on Strings, but a property on Arrays. methods require "()" with parameters if necessary. Properties do not.
		int[] numbers = new int[3];
		System.out.println(numbers.length);
		
		
	}

}
