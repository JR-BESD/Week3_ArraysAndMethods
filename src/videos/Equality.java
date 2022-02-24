package videos;

public class Equality {

	public static void main(String[] args) {
//		Objects such as Strings, in memory, always point to different references even if they read the same. 
//		primitive data types, if equal,  always point to the same literal.
		String a = new String("Hello");
		String b = new String("Hello");
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a == b);
		
		int x = 5;
		int y = 5;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(x == y);
		
//		How do we check if a String is acctually pointing to the same object?
		String c = new String("Hello");
		String d = c;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(c == d);
		
//		How do we compare two Object to see if they have the same value?
		System.out.println("equals() method: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.equals(b));
		
				
	}

}
