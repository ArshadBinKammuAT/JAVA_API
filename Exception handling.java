class Eh{
	public static void main(String args[]){
		System.out.println("Start");
		int a=100/20;
		System.out.println(a);
		System.out.println("end");
	}
}
		

//Exception opccured problem
class Eh{
	public static void main(String args[]){
		System.out.println("Start");
		int a=100/0;
		System.out.println(a);
		System.out.println("end");
	}
}
		
//output
Start
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Eh.main(Eh.java:4)

//Handling of Exception
class Eh{
	public static void main(String args[]){
		try{
			int a=100/0;
			System.out.println(a);
		}
		catch(Exception e){
			System.out.println("Test:::::  "+e);
		}finally{
			System.out.println("finally block");
		}

	}
}


//different Exceptions
class Eh{
	public static void main(String args[]){
		try{
			//int a=100/10;
			//System.out.println(a);
				String s1="A";
				char c =s1.charAt(8);
				System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e1){
			System.out.println("ONE:::::  "+e1);		
		}
		catch(IndexOutOfBoundsException e2){
			System.out.println("TWO:::::  "+e2);		
		}
		catch(RuntimeException e3){
			System.out.println("THREE:::::  "+e3);		
		}
		catch(Exception e4){
			System.out.println("THREE:::::  "+e4);		
		}
		catch(Throwable e5){
			System.out.println("THREE:::::  "+e5);		
		}
		
		{
			System.out.println("finally block");
		}
		}
	}


		
//Output
ONE:::::  java.lang.StringIndexOutOfBoundsException: Index 8 out of bounds for length 1
finally block


//for Exception 3
class Eh{
	public static void main(String args[]){
		try{
			int a=10/0;			
		}
		catch(StringIndexOutOfBoundsException e1){
			System.out.println("ONE:::::  "+e1);		
		}
		catch(IndexOutOfBoundsException e2){
			System.out.println("TWO:::::  "+e2);		
		}
		catch(RuntimeException e3){
			System.out.println("THREE:::::  "+e3);		
		}
		catch(Exception e4){
			System.out.println("THREE:::::  "+e4);		
		}
		catch(Throwable e5){
			System.out.println("THREE:::::  "+e5);		
		}
		
		{
			System.out.println("finally block");
		}
		}
	}


//output
THREE:::::  java.lang.ArithmeticException: / by zero
finally block


//Exception in ArrayIndexOutOfBoundsException
class Eh{
	public static void main(String args[]){
		try{
			int a[]=new int[2];
			a[0]=100;
			a[1]=200;
			a[2]=300;
			
		}
		catch(StringIndexOutOfBoundsException e1){
			System.out.println("ONE:::::  "+e1);		
		}
		catch(IndexOutOfBoundsException e2){
			System.out.println("TWO:::::  "+e2);		
		}
		catch(RuntimeException e3){
			System.out.println("THREE:::::  "+e3);		
		}
		catch(Exception e4){
			System.out.println("THREE:::::  "+e4);		
		}
		catch(Throwable e5){
			System.out.println("THREE:::::  "+e5);		
		}
		
		{
			System.out.println("finally block");
		}
		}
	}

//Output
TWO:::::  java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
finally block


//
