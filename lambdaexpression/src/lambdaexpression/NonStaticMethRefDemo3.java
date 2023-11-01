package lambdaexpression;

@FunctionalInterface
interface MyLambda10{
	void display(String str);
}
public class NonStaticMethRefDemo3 {

	public void reverse(String str) {
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
		
	}
	public static void main(String[] args) {
		
		NonStaticMethRefDemo3 obj=new NonStaticMethRefDemo3();
		
//		Non static method can be called with the help of object
//		Static method can be called with the help of only class name
		
		MyLambda10 m=obj::reverse;
		m.display("INdia");
		
	}
}
