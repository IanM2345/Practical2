package griffith;
import java.util.Scanner;
public class Calculation {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter The Length of The Rectangle");
		int num1 = scan.nextInt();
		
		System.out.println("Enter The Width Of The Rectangle");
		int num2 = scan.nextInt();
		
		int area = num1*num2;
		System.out.println("The area of the rectangles is:" +area);
	}
}
