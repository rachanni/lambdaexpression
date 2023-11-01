package lambdaexpression;

@FunctionalInterface
interface MyLambad13{
	int display(String str1,String str2);
}
public class StaticMethWith2ParaRefDemo {

	public static void main(String[] args) {
		
		MyLambad13 m=String::compareTo;
		System.out.println(m.display("ravi", "hello"));
	}
}
