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
