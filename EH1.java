class Eh{
	public static void main(String args[]){
		try{
			int a=100/0;
			System.out.println(a);
		}
		catch(Exception e){
			System.out.println("Test:::::  "+e);
			
			try{
				String s1="A";
				char c =s1.charAt(8);
				System.out.println(c);
			}
			catch(Exception e2){
				System.out.println("DEMO:::: "+e2);
			}
			finally{
				System.out.println("inner finally block");
			}
		
				
		}finally{
			System.out.println("finally block");
		}
		}
	}
		
//output
Test:::::  java.lang.ArithmeticException: / by zero
DEMO:::: java.lang.StringIndexOutOfBoundsException: Index 8 out of bounds for length 1
inner finally block
finally block


// only affects the exception line
class Eh{
	public static void main(String args[]){
		try{
			int a=100/10;
			System.out.println(a);
				String s1="A";
				char c =s1.charAt(8);
				System.out.println(c);
		}
		catch(Exception e){
			System.out.println("Test:::::  "+e);		
		}finally{
			System.out.println("finally block");
		}
		}
	}



//Output
10
Test:::::  java.lang.StringIndexOutOfBoundsException: Index 8 out of bounds for length 1
finally block
