class Test{
	int y=2;
	public static void go(){
		double a=Math.pow(2.0,3.0);
		System.out.println("power is:"+a);
	    
		int x=3;
		
		int b=(int)Math.pow(x,new Test().y);
		System.out.println("Power is:"+b);
	}
	public static void main(String[] args){
		go();
}
}

//Output
power is:8.0
Power is:9
		
