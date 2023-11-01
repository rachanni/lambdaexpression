package lambdaexpression;

@FunctionalInterface
interface MyLambda3{
	public abstract int add(int x,int y); 
}
public class LambdaExpWithTwoPara {

	public static void main(String []args) {
	
		
	MyLambda3 m=(x,y)->{return x+y;};
	int result=m.add(20,31);
	System.out.println(result);
	
	}
}
