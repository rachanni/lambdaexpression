package lambdaexpression;

@FunctionalInterface
interface MyLambda14 {
	
	String display(String str1,String str2);
}
public class StaticMethConcateRefDemo {

	public static void main(String[] args) {
		
		
		MyLambda14 m=String::concat;
		System.out.println(m.display("Chanda", "Singh"));
	}
}
