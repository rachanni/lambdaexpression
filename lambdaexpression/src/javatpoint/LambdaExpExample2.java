package javatpoint;

@FunctionalInterface
interface Drawable1{
	void draw();
}
public class LambdaExpExample2 {

	public static void main(String[] args) {
		
		 int width =10;
		 
//		 implement Drawable using annonymous lambda expression
		 
		Drawable1 d=()->{
			System.out.println("Width: "+width);
		};
		d.draw();

	}
}
