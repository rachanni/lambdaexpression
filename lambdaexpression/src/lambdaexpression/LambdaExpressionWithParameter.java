package lambdaexpression;

// One Parameter

@FunctionalInterface
interface MyLambda2{
	public abstract void display(String str);
}

public class LambdaExpressionWithParameter {

	public static void main(String[] args) {
		
		MyLambda2 m=(s)->{System.out.println(s);};
		
		m.display("Hello World");
		
	}
}
