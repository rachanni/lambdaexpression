package lambdaexpression;

interface MyLambda5{
	public abstract void display();
}

class Demo1{

	
	public void method1() {
		
		int count =0;
		
		MyLambda5 m=()->{
		
//		Accessing local variable is allowed	
		System.out.println(count);
		
//		Modifying local variable is not allowed
//		System.out.println(++count);
		};
		
//		Can we modify count here? No b/c we are accessing count inside lambda expression
//		if lambda expression is not accessing count then we can modify count here.
		
//		count++;
		m.display();
	}
	
}
public class LambdaExpressionUsingLocalVar {

	public static void main(String[] args) {
		
		Demo d=new Demo();
		d.method1();
	}
}
