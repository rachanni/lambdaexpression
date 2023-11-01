package lambdaexpression;

@FunctionalInterface
interface MyLambda8{
	public abstract void display(String str);
}
public class StaticMethodRefDemo1 {

	public static void main(String[] args) {
		
		MyLambda8 m=System.out::println;
		m.display("Hello");
	}
}
