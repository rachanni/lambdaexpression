package lambdaexpression;

/*
 Instead of writting a separate class or annonymous inner class for defining a functional interface
 method, we can write single line/single expression to define a method display()
 
*/

@FunctionalInterface
interface MyLamda{
	void display();
}
public class LambdaExpressionDemo {

	public static void main(String[] args) {
		
//		we have define a method display() but not mention the name of method
//		b/c there is only one method in interface/functional interface.
//		Here method is working as a object.
		
		MyLamda m=()->
		{
			System.out.println("Hello World");
		};
		
		m.display();
	}
}
