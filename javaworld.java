//Scanner class
import java.util.Scanner;
public class Example{
	public static void main(String args[]){
		
		Scanner scn=new Scanner(System.in);
		int x,y;
		System.out.println("num 1:");
		x=scn.nextInt();
		
		System.out.println("num 2:");
		y=scn.nextInt();
		
		int z;
		z=x+y;
		System.out.println(x+"+"+y+" = " +z);
	}
}

//output
num 1:
1
num 2:
2
1+2 = 3

		
//unary operators in Java
class Example{
	public static void main(String args[]){
		int x=10;
		System.out.println(++x);
		System.out.println(x++);
		int y=10;
		System.out.println(--y);
		System.out.println(y--);	
	}
}

//Output
11
11
9
9


class Example{
	public static void main(String args[]){
		boolean x=true;
		System.out.println(!x);
		int y=10;
		int z=20;
		System.out.println(-y);
		System.out.println(-z);
		
		System.out.println(+y);
		System.out.println(+z);
		
		int a=10;
		System.out.println(~a);//bitwise complement
	}
}

//Output
false
-10
-20
10
20
-11

//Ternary operator
class Example{
	public static void main(String args[]){
		int mark=50;
		String result;
		result = mark>60 ? "PASS" :"FAIL";
		System.out.println(result);
	}
}

//Output
FAIL




