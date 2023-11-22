/*
String Builder 
1.final class
2.mutable object
3.methods are not synchronised
4.not thread safety
5.it does not works multithread environment
6.javap java.lang.StringBuilder

StringBuffer
1.final class
2.mutable object
3.methods are synchronized
4.thread safety
5.it works multithread environment
6.javap java.lang.StringBuffer

class Sb{
	public static void main(String args[]){
		StringBuffer sb=new StringBuffer();
		System.out.println(sb);
	}
}




//to delete some character from string

class SB{
	public static void main(String args[]){
		StringBuffer sb=new StringBuffer("Arshad Achuthodika");
		System.out.println(sb);
		sb.delete(3,10);
		System.out.println(sb);
	}
}
		
//output
abc


//String operations

class Eh{
	public static void main(String args[]){
		StringBuffer sb=new StringBuffer();
		System.out.println(sb);
		sb.append("arshad");
		System.out.println(sb);
		sb.append("Achuthodika");
		System.out.println(sb);
		
		//string object to string buffer object
		String s1="Tamil";
		StringBuffer sb2=new StringBuffer(s1);
		System.out.println(sb2);
		
		//string buffer object to string object
		String s2=sb2.toString();
		String s3=s2.toUpperCase();
		System.out.println(s3);
		
		StringBuffer sb3 = new StringBuffer(s3);
		System.out.println(sb3);
		sb3.reverse();
		System.out.println(sb3);
		
		StringBuffer sb4 = new StringBuffer("manoj");
		System.out.println(sb4);
		sb4.insert(2,"YYY");
		System.out.println(sb4);
	}
}


//output
arshad
arshadAchuthodika
Tamil
TAMIL
TAMIL
LIMAT
manoj
maYYYnoj		
		
		
		
		
		
		
		

		
