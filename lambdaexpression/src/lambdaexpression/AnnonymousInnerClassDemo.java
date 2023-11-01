package lambdaexpression;

@FunctionalInterface
interface MyLambda1{
	void display();
}
public class AnnonymousInnerClassDemo {

	public static void main(String[] args) {
		
		MyLambda1 m=new MyLambda1() {
			
			@Override
			public void display() {
				
				System.out.println("Hello World");
			}
		};
		
		m.display();
	}
}
