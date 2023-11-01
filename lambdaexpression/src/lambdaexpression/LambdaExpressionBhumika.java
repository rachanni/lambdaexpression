package lambdaexpression;

/* 
   This is the basic way.
1. Class implementing inteface
2. Creating an instance of the class and call the method display()
3. My m=new My(); object is refering to My class
4. MyLamda m=new My(); object is refering to MyLamda interface. This is also OK.

*/

@FunctionalInterface
interface MyLambda{
	public abstract void display();
}

class My implements MyLambda{
	
	public void display() {
		System.out.println("Hello world");
	}
}
public class LambdaExpressionBhumika {

	public static void main(String[] args) {
		
		MyLambda m=new My();
		m.display();
		
	}
}
