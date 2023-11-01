package lambdaexpression;

@FunctionalInterface
interface MyLambda7{
	void display();
}

class UseLambda{

//	Taking lambda exp as a parameter
	public void callLambda(MyLambda7 m) {
		m.display();
	}
}

class Demo7{
	public void method1() {
		UseLambda ul=new UseLambda();
		ul.callLambda(()->{System.out.println("Hello");});
	}
}
public class PassingLambdaExpAsPara {

	public static void main(String[] args) {
		
		Demo7 d=new Demo7();
		d.method1();
	}
}
