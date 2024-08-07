/**
 * ArrayJava
 */
public class ArrayJava {

	 public static void main(String [] args){
		int a = 10;
		int b = 20;
		System.out.println("Value of a beforeswaping : " + a);
		System.out.println("Value of b beforeswaping : " + b);

		a = a+b;
		b = a-b;
		a = a-b;

		System.out.println("Value of a Afterswaping : " + a);
		System.out.println("Value of b Afterswaping : " + b);
	 }
}