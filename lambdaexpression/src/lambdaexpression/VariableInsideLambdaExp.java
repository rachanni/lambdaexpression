package lambdaexpression;

interface MyLambda4{
	public abstract void display();
}

class Demo{
	
	public void method1(){
		
		MyLambda4 m=()->{
			
//			Variable inside lambda expression
			int count=0;
//			Multiple statement inside lambda expression
			System.out.println("Hello");
			System.out.println("World");
//			Accessing count
			System.out.println(count);
//			Modifying count
			System.out.println(++count);
		};
		
		m.display();
	}
}
public class VariableInsideLambdaExp {

	public static void main(String[] args) {
		
		Demo d=new Demo();
		d.method1();
	}
}
