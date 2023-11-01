package lambdaexpression;

@FunctionalInterface
interface MyLambda12{
	public abstract void display(String str);
}
public class CtorRefDemo {

	public CtorRefDemo(String str) {
		
		System.out.println(str.toUpperCase());
	}
	public static void main(String[] args) {
		
//		To call ctor use new keyword 
		MyLambda12 m=CtorRefDemo::new;
		m.display("Ravi");
	}
}
