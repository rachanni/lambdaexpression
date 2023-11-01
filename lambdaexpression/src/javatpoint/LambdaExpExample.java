package javatpoint;

@FunctionalInterface
interface Drawable{
	void draw();
}
public class LambdaExpExample {

	public static void main(String[] args) {
		
		 int width =10;
		 
//		 implement Drawable using annonymous inner class
		 
		 Drawable d =new Drawable() {
			
			@Override
			public void draw() {
				// TODO Auto-generated method stub
				
				System.out.println("Width: "+width);
				
			}
		};
		 
		d.draw();

	}
}
