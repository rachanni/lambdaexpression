package lambdaexpression;

interface MyLambda9{
	public abstract void display(String str);
}


public class StaticMethRefDemo2 {

	public static void reverse(String str) {
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
		
	}
	public static void main(String[] args) {
		
		MyLambda9 m=StaticMethRefDemo2::reverse;
		m.display("ravi");
		
	}
}
