package lambdaexpression;

@FunctionalInterface
interface MyLambda15{
	boolean display(String str);
}

public class IsEmptyRefDemo {

	
	public static void main(String[] args) {
		
		MyLambda15 m=String::isEmpty;
		System.out.println(m.display(""));
	}
}
