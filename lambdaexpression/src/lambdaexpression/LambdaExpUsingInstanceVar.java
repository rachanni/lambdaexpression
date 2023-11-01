package lambdaexpression;

interface MyLambda6{
	
	public abstract void display();
}

class Demo2{
	
//	instance variable
	int count=0;
	
	public void method1() {
		
		MyLambda6 m=()->{
			System.out.println(count);
			System.out.println(++count);
		};
		++count;
		m.display();
		
	}
}
public class LambdaExpUsingInstanceVar {

	public static void main(String[] args) {
		
		Demo2 d=new Demo2();
		d.method1();
		
	}
}
