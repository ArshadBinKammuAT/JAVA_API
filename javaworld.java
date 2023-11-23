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


//While loop
class Example{
	public static void main(String args[]){
		int i=10;
		while(i>5){
			System.out.println("Helloworld"+i);
			i++;	
		}
		System.out.println("end");
	}
}

//output
Helloworld0
Helloworld1
Helloworld2
Helloworld3
Helloworld4
end

//do-while loop
class Example{
	public static void main(String args[]){
		int i=0;
		do{
			System.out.println("abc");
			i++;
		}
		while(i<5);{
		}
	}
}
//output
abc
abc
abc
abc
abc

//do-while loop
class Example{
	public static void main(String args[]){
		int i=1;
		while(i<1){
			System.out.println("while loop");
		}	
		do{
			System.out.println("do while loop");
		}
		while(i<1);
	}
}

//Output
do while loop

class Example{
	public static void main(String args[]){
		int x=0;
		while(x<5){
			int y=0;
			while(y<x){
				System.out.println("*");
				y++;
			}
			System.out.println();
			x++;
		}
	}
}	
//Output
*

*
*

*
*
*

*
*
*
*






